package lesson3_4_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.*/

public class HomeTask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Длина массива:");
        int n = sc.nextInt();
        int kol = 0;
        int j = 0;

        if (n < 3) {
            System.out.println("Число введено неверно. Введите число больше 3!");
            System.exit(0);
        }
        int[] arr1 = new int[n];

        System.out.println("Первый массив:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(n + 1);
            System.out.print(arr1[i] + " ");
            if (arr1[i] % 2 == 0) {
                kol++;
            }
        }
        System.out.println();
        int[] arr2 = new int[kol];
        System.out.println("Количество четных элементов в первом массиве: " + kol);
        System.out.println("Второй массив:");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[j] = arr1[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

