package lesson3_4_arrays;

/*Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.*/

import java.util.Random;

public class HomeTask3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[15];
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.print("Количество чётных элементов в массиве: " + counter);
    }
}
