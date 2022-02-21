package lesson5_8_classes;

import java.util.Random;
import java.util.Scanner;

public class ManeComputer {

    public static void main(String[] args) {
        Computer sam = new Computer();
        sam.setProcessor("Ryzen");
        sam.setRam(16);
        sam.setSsd(250);
        sam.setResource(1);
        sam.getInfo();
        sam.on();
        sam.on();
        sam.on();

        sam.off();
        sam.off();
        sam.off();

        sam.infoResource();
        sam.on();
        sam.off();
        sam.infoResource();

    }
}

class Computer {
    private String processor;
    private int ram;
    private int ssd;
    private int resource;
    public int condition1 = 0;
    public int condition2 = 0;
    public int colVkl = 0;

    public Computer() {
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void getInfo() {
        System.out.println("Процессор,модель: " + processor);
        System.out.println("Оперативная память,GB: " + ram);
        System.out.println("Жесткий диск,GB: " + ssd);
        System.out.println("Ресурс полных циклов работы (включений/выключений),кол: " + resource);
    }

    int on() {
/*Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.Если комп сгорел, при попытке
включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает*/

        if (condition1 == 0) {
            Random r1 = new Random();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите пароль 0 или 1 для включения компьютера: ");

            int number1 = sc1.nextInt();
            while (number1 > 1) {
                System.out.println("Пароль введен неверно. Введите число 0 или 1!");
                number1 = sc1.nextInt();
            }
            int number2 = r1.nextInt(1);
            if (number1 == number2) {
                System.out.println("Компьютор включон, " + number1 + " равно " + number2);
                condition1 = 1;
                colVkl++;

            } else {
                System.out.println("Компьютор сгорел, " + number1 + " не равно " + number2);
                condition1 = 2;
            }


        } else if (condition1 == 1) {
            System.out.println("Зачем нажимаете! Компьютор уже включон!");

        } else {
            System.out.println("Можете уже не включать... Компьютор сгорел!");
            //System.exit(0);
        }
        return condition1;

    }

    int off() {

        if (condition2 == 0) {
            Random r2 = new Random();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите пароль 0 или 1 для выключения компьютера: ");

            int number1 = sc2.nextInt();
            while (number1 > 1) {
                System.out.println("Пароль введен неверно. Введите число 0 или 1!");
                number1 = sc2.nextInt();
            }
            int number2 = r2.nextInt(1);
            if (number1 == number2) {
                System.out.println("Компьютор выключен, " + number1 + " равно " + number2);
                condition2 = 1;

            } else {
                System.out.println("Компьютор сгорел, " + number1 + " не равно " + number2);
                condition2 = 2;

            }


        } else if (condition2 == 1) {
            System.out.println("Зачем нажимаете! Компьютор уже выключен!");

        } else {
            System.out.println("Можете уже не выключать... Компьютор сгорел!");
            //System.exit(0);
        }
        return condition2;
    }

    void infoResource() {
        if (colVkl > resource) {
            System.out.println("Компьютор сгорел, т.к. превышено количество включений");
        } else {
            System.out.println("Все хорошо, но помните о ресурсе компьютера");
            condition1 = 0;
            condition2 = 0;
        }
    }
}



