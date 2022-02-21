package lesson2_cycles;

/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class HomeTask2 {
    public static void main(String[] args) {

        int h;
        int i = 2;

        for (h = 3; h < 25; h = h + 3) {
            System.out.println(h + " час - " + i + " амеб");
            i = i * 2;
        }

    }
}
