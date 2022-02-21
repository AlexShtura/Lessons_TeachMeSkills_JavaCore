package lesson5_8_classes.pc;

import java.util.Random;
import java.util.Scanner;

public class PC {
    private String cpu;
    private int ram;
    private int rom;
    private int workCycle;

    public PC() {
    }

    public PC(String cpu, int ram, int rom, int workCycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.rom = rom;
        this.workCycle = workCycle;

    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void display() {
        System.out.println("Процессор,модель: " + this.cpu);
        System.out.println("Оперативная память,GB: " + this.ram);
        System.out.println("Жесткий диск,GB: " + this.rom);
        System.out.println("Ресурс полных циклов работы (включений/выключений),кол: " + this.workCycle);
    }

    public void compOn() {
        if (this.workCycle > 0) {
            Random r = new Random();
            int q = r.nextInt(2);
            System.out.println(q);
            Scanner sc = new Scanner(System.in);
            System.out.println("Ввести 0 или 1:");
            int e = sc.nextInt();
            System.out.println(q);


            if (e == q) {


                this.workCycle--;
                this.compOff();
            } else {
                this.workCycle = 0;
                System.out.println("Комп сгорел");
            }

        }


    }

    public void compOff() {
        if (this.workCycle > 0) {
            Random r = new Random();
            int q = r.nextInt(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("Ввести 0 или 1:");
            int e = sc.nextInt();


            if (e == q) {
                this.workCycle--;

            } else {
                this.workCycle = 0;
                System.out.println("Комп сгорел");
            }

        }
        else {
            System.out.println("Ресурсы компа закончились!!!");
        }
    }


}

