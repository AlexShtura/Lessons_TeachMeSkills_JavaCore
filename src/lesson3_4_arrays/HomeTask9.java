package lesson3_4_arrays;

import java.util.Random;
import java.util.Scanner;

/*Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
пользователь введёт неподходящее число, то выдать соответствующее
сообщение*/

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Длина массива:");
        int n = sc.nextInt();
        System.out.println();

        if (n <= 0) {
            System.out.println("Введено неверное число");
            System.exit(0);
        }
        int[] arr = new int[n];
        System.out.println("Массив:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(16);
            System.out.print(arr[i] + " ");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println();
        System.out.println("Сумма первой половины массива - " + sum1);

        for (int i = n - 1; i > n / 2; i--) {
            if (n > 1) {
                sum2 = sum2 + arr[i];
            } else {
                sum2 = 0;
            }
        }
        System.out.println("Сумма второй половины массива - " + sum2);
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше");
        } else if (sum1 < sum2) {
            System.out.println("Сумма второй половины массива больше");
        } else {
            System.out.println("Сумма двух половин массива равны");
        }
    }
}


