package lesson3_4_arrays;

import java.util.Random;

/*Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/

public class HomeTask8 {
    public static void main(String[] args) {
        Random r = new Random(10);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(10);
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(10);
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) arr1[i] / arr2[i];
        }
        System.out.println("Первый массив:");

        for (int element1 : arr1) {
            System.out.print(element1 + "\t");
        }
        System.out.println();
        System.out.println("Второй массив:");

        for (int element2 : arr2) {
            System.out.print(element2 + "\t");
        }
        System.out.println();
        System.out.println("Третий массив:");

        for (double element3 : arr3) {
            System.out.print(element3 + " ");
        }
        System.out.println();
        System.out.println("Целые числа в третьем массиве:");
    }
}

