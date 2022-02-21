package lesson9_string;

public class Demo {
    public static void main(String[] args) {
        String line = "Line";
        String line2 = new String("Line");

        boolean a = line.equals(line2);
        System.out.println(a);
        System.out.println(line == line2);

        /*Book book1 = new Book(12, "book");
        Book book2 = new Book(12, "book");
        System.out.println(book1.equals(book2));*/
    }
}
