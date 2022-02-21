package lesson11_inputOutputStream.task5;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public void process(String a, String b) {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(a));
            BufferedWriter writer = new BufferedWriter(new FileWriter(b))) {
            String line;
            while ((line= reader.readLine())!= null){
                String[]words = line.split(" ");
                if (isAnagram(words[0], words[1])){
                    writer.write(line + "\n");
                }
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    private boolean isAnagram(String a, String b) {
        char[] anagram1 = a.toLowerCase(Locale.ROOT).toCharArray();
        char[] anagram2 = b.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(anagram1);
        Arrays.sort(anagram2);
        return Arrays.equals(anagram1, anagram2);
    }
}
