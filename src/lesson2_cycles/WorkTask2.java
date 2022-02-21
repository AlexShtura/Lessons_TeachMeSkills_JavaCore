package lesson2_cycles;

/*В стране XYZ население равно 10 миллионов человек.
Рождаемость составляет 14 человек на 1000 человек,
меньше 7 человек на 1000 человек, а смертностность
не может быть меньше 6 человек на 1000 человек.*/

public class WorkTask2 {
    public static void main(String[] args) {
        int i;
        int born = 14;
        int death = 8;
        int people = 10000000;

        for (i = 1; i <= 10; i++) {
            if (born >= 7) {
                born--;
            }
            if (death >= 6) {
                death--;
            }
            people += people * (born - death) / 1000;
        }
        System.out.println(people + " людей");
    }
}
