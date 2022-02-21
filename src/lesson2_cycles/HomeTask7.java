package lesson2_cycles;

/*Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99*/

public class HomeTask7 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
