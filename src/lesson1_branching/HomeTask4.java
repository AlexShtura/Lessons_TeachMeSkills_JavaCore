package lesson1_branching;

/*Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.*/

public class HomeTask4 {
    public static void main(String[] args) {
        int a = -2;
        int b = 0;
        int c = 3;
        int x = 0;

        if (a > 0) {
            x++;
        }
        if (b > 0) {
            x++;
        }
        if (c > 0) {
            x++;
        }
        System.out.println("количество положительных чисел: " + x);
    }
}
