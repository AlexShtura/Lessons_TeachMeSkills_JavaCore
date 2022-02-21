package lesson2_cycles;

/*Напишите программу вывода всех четных чисел от 2 до 100
включительно*/

public class HomeTask6 {
    public static void main(String[] args) {
        int i;

        for (i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



