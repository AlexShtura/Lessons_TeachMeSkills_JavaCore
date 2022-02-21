package lesson3_4_arrays;

/*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
на экран сначала в строку, отделяя один элемент от другого пробелом, а затем
в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.*/

public class HomeTask1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0, k = 2; i < arr.length; i++, k += 2) {
            arr[i] = k;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\n" + arr[i]);
        }
    }
}
