package lesson11_inputOutputStream.task5;

public class AppMain {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        anagram.process("lesson11Task5File1.txt", "lesson11Task5File2.txt");
    }
}
