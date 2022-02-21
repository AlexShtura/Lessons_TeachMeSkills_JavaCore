package lesson2_cycles;

/*Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.*/

public class HomeTask4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int s = 0;
        int i;

        for (i = 1; i <= b; i++) {
            s = s + a;
        }
        System.out.println(s);
    }
}
