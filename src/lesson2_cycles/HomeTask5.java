package lesson2_cycles;

/*Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

public class HomeTask5 {
    public static void main(String[] args) {

        int i;
        double k;
        double d = 2.54;

        for (i = 1; i <= 20; i++) {
            k = i * d;
            System.out.println(i + " дюйм - " + k + " см");
        }
    }
}
