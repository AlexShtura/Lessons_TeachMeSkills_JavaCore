package lesson2_cycles;

/*Вычислить: 1+2+4+8+…+256*/

public class HomeTask3 {
    public static void main(String[] args) {

        int i;
        int s = 0;

        for (i = 1; i <= 256; i = i * 2) {
            s = s + i;
        }
        System.out.println(s);
    }
}
