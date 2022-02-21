package lesson3_4_arrays;

import java.util.Random;
import java.util.Scanner;

/*Начало всех задач: Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).*/

public class HomeTask21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Размеры двумерного массива:");
        int n = sc.nextInt();
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(51);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }

//1) Посчитать сумму четных элементов стоящих на главной диагонали.
        /*int summ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (mass[i][j] % 2 == 0) {
                        summ += mass[i][j];
                    }
                }
            }
        }
        System.out.println("Сумма четных элементов стоящих на главной диагонали: " + summ);*/

//2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).
        /*int el = 0;
        System.out.println("Нечетные элементы стоящие под главной диагональю включительно: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j){
                    el = mass[i][j];
                    if (el % 2 != 0){
                        System.out.print(el + " ");
                    }
                }
            }
        }*/

//3)Проверить произведение элементов какой диагонали больше.
        /*int mult1=1;
        int mult2=1;
        System.out.println("Произведение главной диагонали: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    mult1 = mult1*mass[i][j];
                }
            }
        }
        System.out.println(mult1);
        System.out.println("Произведение вспомогательной диагонали: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n-1){
                    mult2 = mult2*mass[i][j];
                }
            }
        }
        System.out.println(mult2);
        if (mult1 > mult2){
            System.out.println("Произведение главной диагонали больше!");
        }else if (mult1 < mult2){
            System.out.println("Произведение вспомогательной диагонали больше!");
        }else{
            System.out.println("Ты счастливчик!!! Произведение диагоналей равны!");
        }*/

//4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно).
        /*int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n-1 && mass[i][j]%2 == 0){
                    sum+=mass[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Сумма четных элементов стоящих над побочной диагональю: " + sum);*/

//5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
        /*for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Транспонированная матрица");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(mass[i][j] + "\t");
            }
            System.out.println();
        }*/
    }
}
