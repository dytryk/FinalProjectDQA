package com.example.FinalProjectDQA;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.input.KeyCode;

import java.util.*;

import java.util.Timer;

public class GUI extends Application {
    // set the size of the board to be displayed
    public static final int BOARD_WIDTH = 15;
    public static final int BOARD_HEIGHT = 10;
    // set the starting position of the "frog"
    private int x = 7;
    private int y = 8;

    private static ArrayList<Terrain> rows = new ArrayList<>();
    private static ArrayList<String> rowStr = new ArrayList<>();

    private boolean isWon = false;
    private boolean isLost = false;

    /**
     * Set up the starting scene of your application given the primaryStage (basically the window)
     * https://docs.oracle.com/javase/8/javafx/api/index.html
     *
     * @param primaryStage the primary container for scenes
     */

    @Override
    public void start(Stage primaryStage) {

        // Add a title to the application window
        primaryStage.setTitle("Frogger");

        // prepare the scene layout to use a BorderPane -- a top, bottom, left, right, center style pane layout
        // https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
        BorderPane layout = new BorderPane();

        // Create a new scene using this layout
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Scene.html
        // define the size of this scene
        double WINDOW_WIDTH = 1920;
        double WINDOW_HEIGHT = 1010;
        Scene exampleScene = new Scene(layout, WINDOW_WIDTH, WINDOW_HEIGHT);

        // make this scene the initial (and for now only) scene in your application
        primaryStage.setScene(exampleScene);

        // create a new text node to display text on the interface
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/text/Text.html
        Text frame = new Text(getFrame());
        Font frameFont = new Font("Courier New", 20);
        frame.setFont(frameFont);
        frame.setTextAlignment(TextAlignment.CENTER);
        // add this text field to the layout
        layout.setCenter(frame);

        // define code to run every time a KeyPressed event is detected on this window to check for ESC to close
        // NOTE: there even is of type javafx.scene.input.KeyEvent
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/input/KeyEvent.html
        exampleScene.setOnKeyPressed(event -> {
            // check if the key that was pressed is the ESC key
            if (event.getCode().equals(KeyCode.ESCAPE)) {
                System.exit(0);
            }
            // check if the key is any of the arrows and move
            else if (event.getCode().equals(KeyCode.W)) {
                moveUp();
                frame.setText(getFrame());
            } else if (event.getCode().equals(KeyCode.S)) {
                moveDown();
                frame.setText(getFrame());
            } else if (event.getCode().equals(KeyCode.A)) {
                moveLeft();
                frame.setText(getFrame());
            } else if (event.getCode().equals(KeyCode.D)) {
                moveRight();
                frame.setText(getFrame());
            }
        });

        // display the interface
        primaryStage.show();
    }

    // holds generated lines of terrain for the board to call
    private LinkedList<ArrayList<Unit>> terrain = new LinkedList<>();

    public void generateTerrain() {
        int numRows = 10;
        for (int i = numRows; i > 0; i--) {
            if (i < 3) {
                Terrain t = new Terrain();
                ArrayList<Unit> tEmpty = t.emptyRow();
                terrain.add(tEmpty);
            } else {
                Terrain t = new Terrain();
                ArrayList<Unit> temp = t.generateTerr();
                terrain.add(temp);
                rowStr.add(temp.toString());
            }
        }
    }


//    17*(y) + 7 + x off by 1
    //18*(y) + 5 + x off by 6/7

    // define simple move functions to change the value of x and y (frog location)
    public void moveUp() {
        if (y == 0) {
            isWon = true;
        } else if (y >= 0 && (getFrame().charAt(18 * (y) - 1 + x) != 'X')) {
            y -= 1;
        }
    }

    public void moveDown() {
        if (y < BOARD_HEIGHT && (getFrame().charAt(18 * (y + 2) - 1 + x) != 'X')) {
            y += 1;
            if (y == 10) {
                isLost = true;

            }
        }
    }

    public void moveLeft() {
        if (x > 0 && ((getFrame().charAt(18 * (y + 1) - 2 + x) != 'X'))) {
            x -= 1;
        }
    }

    public void moveRight() {
        if (x < BOARD_WIDTH - 1 && ((getFrame().charAt(18 * (y + 1) + x) != 'X'))) {
            x += 1;
        }
    }

    static Timer timer = new Timer();
    static long tick = 0;

    public char[] getNextRow() {
        ArrayList<Unit> nextRow = terrain.remove();
        generateTerrain();
        char[] row = new char[nextRow.size()];
        for (int i = 0; i < nextRow.size(); i++) {
            row[i] = nextRow.get(i).toChar();
        }
        return row;
    }

    public String toString(ArrayList<Unit> row) {
        String rowStr = "";
        Unit o = new Obstacle();
        Unit s = new Space();
        for (int i = 0; i < row.size(); i++) {
            if ((row.get(i).getClass()).equals(o.getClass())) {
                rowStr = rowStr + "X";
            } else if ((row.get(i).getClass()).equals(s.getClass())) {
                rowStr = rowStr + " ";
            } else {
                rowStr = rowStr + "O";
            }
        }
        return rowStr;
    }

    private String toString2(Terrain t) {
        String s2 = t.toString();
        return s2;
    }


    // draw a board using BOARD_WIDTH, BOARD_HEIGHT, x, and y
    public String getFrame() {
        generateTerrain();
        StringBuilder frame = new StringBuilder();
        // add a top border

        if (isWon) {
            frame.delete(0, frame.length());
            frame.append("You won!!\n");
            frame.append("(press esc to close)");
            return frame.toString();
        }
        if (isLost) {
            frame.delete(0, frame.length());
            frame.append("you have done it\n");
            frame.append("(press esc to close)");

            return frame.toString();
        }

        frame.append("-".repeat(BOARD_WIDTH));
        // add each row of the board
        for (int r = 0; r < BOARD_HEIGHT; r++) {
            frame.append('\n');
            // add a left border
            frame.append('|');
            // fill in this row (possibly including a frog)
            for (int c = 0; c < BOARD_WIDTH; c++) {
                if (r == y && c == x) {
                    frame.append('ö');
                } else {
                    ArrayList<Unit> temp = terrain.get(r);
                    String ss = toString(temp);
                    frame.append(ss.charAt(c));
                }
            }
            // add a right border
            frame.append('|');
        }
        // add a bottom border
        frame.append('\n');
        frame.append("-".repeat(BOARD_WIDTH));
        return frame.toString();
    }


    public void run(){
        launch();
    }
}
