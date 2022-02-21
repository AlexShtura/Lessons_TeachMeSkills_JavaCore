package lesson2_cycles;

/*За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит
сумму вклада и количество месяцев. А банк вычисляет конечную
сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.
Пусть сумма вклада будет представлять тип float.*/

import java.util.Scanner;

public class WorkTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();
        int i = period;

        while (i > 0) {
            sum += sum * 0.07;
            i--;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
        in.close();
    }
}
