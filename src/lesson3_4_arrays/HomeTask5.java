package lesson3_4_arrays;

import java.util.Random;

/*Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).*/

public class HomeTask5 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 5;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        double sum1 = 0;
        double sum2 = 0;

        System.out.println("Первый массив:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(16);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(16);
            System.out.print(arr2[i] + " ");
        }

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        sum1 = sum1 / n;
        sum2 = sum2 / n;
        System.out.println();
        System.out.println("Cреднее арифметическое элементов первого массива - " + sum1);
        System.out.println("Cреднее арифметическое элементов второго массива - " + sum2);

        if (sum1 > sum2) {
            System.out.println("Cреднее арифметическое элементов первого массива больше.");
        } else if (sum1 < sum2) {
            System.out.println("Cреднее арифметическое элементов второго массива больше.");
        } else {
            System.out.println("Cреднее арифметическое элементов двух массива равны.");
        }
    }
}
