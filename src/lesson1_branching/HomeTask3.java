package lesson1_branching;

/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.*/

public class HomeTask3 {
    public static void main(String[] args) {
        int a = 0;
        if (a > 0) {
            a++;
            System.out.println(a);
        } else if (a < 0) {
            a = a - 2;
            System.out.println(a);
        } else {
            a = 10;
            System.out.println(a);
        }
    }
}
