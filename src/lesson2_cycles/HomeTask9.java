package lesson2_cycles;

/*Напишите программу, которая выводит на консоль таблицу умножения*/

public class HomeTask9 {
    public static void main(String[] args) {
        int i;
        int j;

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
