package lesson5_8_classes.matrix;

/*Создать класс "Матрица". Класс должен иметь следующие поля:
1) двумерный массив вещественных чисел;
2) количество строк и столбцов в матрице.
Класс должен иметь следующие методы:
1) сложение с другой матрицей;
2) умножение на число;
3) вывод на печать;
4) умножение матриц - по желанию.*/

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4, 10);
        matrix.displayArray();
        System.out.println();
        matrix.multiplexArray(2);
        matrix.displayArray();
        System.out.println();
        matrix.summArray(matrix.generateArray());
        matrix.displayArray();
        double[][] array1 = matrix.generateArray();
        System.out.println("summ");
        matrix.summArray(array1);
        matrix.displayArray();
        System.out.println("multiplex");
        matrix.multiplexArrays(array1);
        matrix.displayArray();


    }
}
