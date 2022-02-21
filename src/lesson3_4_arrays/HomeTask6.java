package lesson3_4_arrays;

/*Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.*/

import java.util.Random;

public class HomeTask6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(11);
            System.out.print(arr[i] + " ");
        }
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(" - возрастающий массив");
        } else {
            System.out.println(" - другой массив");
        }
    }
}
