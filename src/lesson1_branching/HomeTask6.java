package lesson1_branching;

/*Даны 2 числа. Вывести большее из них.*/

public class HomeTask6 {
    public static void main(String[] args) {
        int a = -100;
        int b = -5;

        if (a > b) {
            System.out.println("Большее число из 2 чисел: a = " + a);
        } else if (a < b) {
            System.out.println("Большее число из 2 чисел: b = " + b);
        } else if (a == b) {
            System.out.println("Оба числа равны: а = b = " + a);
        }
    }
}
