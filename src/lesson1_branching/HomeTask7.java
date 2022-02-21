package lesson1_branching;

/*В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.*/

public class HomeTask7 {
    public static void main(String[] args) {
        int a = 20;
        int ost = a % 10;

        if (a < 0) {
            System.out.println("Количество программистов задано не верно");
        } else if (a == 0) {
            System.out.println(a + " программистов");
        } else if (a == 1) {
            System.out.println(a + " программист");
        } else if (a > 1 && a < 5) {
            System.out.println(a + " программиста");
        } else if (a > 4 && a < 19) {
            System.out.println(a + " программистов");
        } else if (ost == 1) {
            System.out.println(a + " программист");
        } else if (ost > 1 && ost < 5) {
            System.out.println(a + " программист");
        } else {
            System.out.println(a + " программистов");
        }
    }
}
