package lesson2_cycles;

/*В стране XYZ население равно 10 миллионов человек.
Рождаемость составляет 14 человек на 1000 человек,
смертность - 8 человек. Рассчитайте, какая численность
населения будет через 10 лет, принимая во внимание,
что показатели рождаемости и смертности постоянны.*/

public class WorkTask1 {
    public static void main(String[] args) {
        int i;
        int born = 14;
        int death = 8;
        int people = 1000000;

        for (i = 1; i <= 10; i++) {
            people += people * (born - death) / 1000;
        }
        System.out.println(people + " людей");
    }
}
