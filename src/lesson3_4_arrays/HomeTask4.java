package lesson3_4_arrays;

import java.util.Random;

/*Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.*/

public class HomeTask4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(21);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Заменен каждый элемент с нечётным индексом на ноль");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

