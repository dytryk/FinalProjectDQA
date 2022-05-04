package com.example.FinalProjectDQA;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer
{
    static Timer timer = new Timer();
    static int tick = 0;

    public GameTimer(int i) {
    }

    public static void main(String[] args)
    {
        Timer(10);
    }

    public static void Timer (int seconds)
    {
        TimerTask task;
        task = new TimerTask()
        {
            private final int maxTicks = seconds/3;

            @Override
            public void run() {
                if (tick < maxTicks) {
                    System.out.println(tick + 1);
                    tick++;
                } else {
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 3000);
    }
}


//public class GameTimer extends Timer
//{
//    private Timer timer;
//    static int tick = 0;
//
//    public GameTimer(int seconds){
//        this.timer = new GameTimer(seconds);
//    }
//
//    public void Timer (int seconds)
//    {
//        TimerTask task;
//        Timer timer = this.timer;
//        task = new TimerTask()
//        {
//            private final int maxTicks = seconds/3;
//
//            @Override
//            public void run() {
//                if (tick < maxTicks) {
//                    System.out.println(tick + 1);
//                    tick++;
//                } else {
//                    timer.cancel();
//                }
//            }
//        };
//        timer.schedule(task, 0, 3000);
//    }
//
//    public static void main(String[] args) {
//        Timer t = new GameTimer(20);
//    }
//}