package lesson1_branching;

/*Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.*/

public class HomeTask5 {
    public static void main(String[] args) {
        int a = -2;
        int b = 856;
        int c = 2;
        int x = 0;
        int y = 0;

        if (a > 0) {
            x++;
        } else if (a < 0) {
            y++;
        }
        if (b > 0) {
            x++;
        } else if (b < 0) {
            y++;
        }
        if (c > 0) {
            x++;
        } else if (c < 0) {
            y++;
        }
        System.out.println("Количество положительных чисел: " + x);
        System.out.println("Количество отрицательных чисел: " + y);
    }
}
