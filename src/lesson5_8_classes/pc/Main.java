package lesson5_8_classes.pc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PC comp = new PC("AMD", 16, 256, 2);

        comp.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во циклов");
        int counter = scanner.nextInt();

        while (counter>0){
            comp.compOn();
            counter--;
        }
        scanner.close();
    }
}
