package lesson3_4_arrays;

import java.util.Random;

/*Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.*/

public class HomeTask7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(16);
        }
        for (int el : arr) {
            System.out.print(el + "\t");
        }
        int maxNumber = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxNumber) {
                maxNumber = arr[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальное число в массиве - " + maxNumber);
        System.out.println("Индекс числа в массиве - " + maxIndex);
    }
}
