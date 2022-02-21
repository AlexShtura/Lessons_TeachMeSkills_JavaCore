package lesson18_multithreaded.homeWork.version4;

import java.io.File;

public class AppMainThread {
    public static void main(String[] args) {
        int threads = 10;

        File in = new File("D:\\Doc\\TeachMeSkills\\Projects\\src\\lesson18\\homeWork\\version4\\input\\inputLesson18.txt");
        File out = new File("D:\\Doc\\TeachMeSkills\\Projects\\src\\lesson18\\homeWork\\version4\\output\\output_inputLesson18.txt");

        Thread[] a = new Thread[threads];
        for (int i = 0; i < a.length; i++) {
            int startPoint = (((in.list()).length) / threads) * i;
            int stopPoint = (((in.list()).length) / threads) * (i+1);
            if ((in.list()).length % threads !=0 && i == (threads - 1)){
                stopPoint = stopPoint + (in.list()).length % threads;
            }
            a[i] = new Thread(new CopyThreads(in, out, startPoint, stopPoint));
        }
        for (int i = 0; i < a.length; i++){
            a[i].start();
        }
        for (int i = 0; i < a.length; i++) {
            try {
                a[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
