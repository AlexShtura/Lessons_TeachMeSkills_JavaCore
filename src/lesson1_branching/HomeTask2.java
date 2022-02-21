package lesson1_branching;

/*Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует.*/

public class HomeTask2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 10;
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Треугольник с такими сторонами существует");
        } else {
            System.out.println("Треугольника с такими сторонами не существует");
        }
    }
}
