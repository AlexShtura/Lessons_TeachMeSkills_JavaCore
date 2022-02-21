package lesson9_string;

/*Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения сивола(B).*/

public class String1 {
    public static void main(String[] args) {
        String line = "line hello spring best react ";
        System.out.println(line.substring(line.indexOf("h"), line.lastIndexOf("b")));
        System.out.println();
        System.out.println(line.replace(line.charAt(3), line.charAt(0)));
        System.out.println();
        String string = "А\nроза\nупала\nна\nлапу\nАзора";
        System.out.println(string);
        String[] mass = string.split("\n");
        for (int i = 0; i < mass.length; i++) {
            if (isPalindrom(mass[i])) {
                System.out.println(mass[i]);
            }
        }
    }
    private static boolean isPalindrom(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString().equals(line);
    }
}
