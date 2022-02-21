package lesson2_cycles;

/*Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?*/

public class HomeTask1 {
    public static void main(String[] args) {
        int d = 1;
        double kmStart = 10;
        double km = 0;

        while (d < 8) {
            km = km + kmStart;
            kmStart = kmStart + (kmStart * 0.1);
            d++;
        }
        System.out.print(km);
    }
}
