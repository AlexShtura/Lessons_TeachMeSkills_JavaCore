package lesson11_inputOutputStream.task3;

import java.io.*;

public class TextHandler {
    //String test1;
    //String[] test2;
    public String process(String src, String black, String destination) {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(src));
             BufferedReader readerBlack = new BufferedReader(new FileReader(black));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                builder.append(line).append(" ");
            }
            String text = builder.toString();
            String[] str = text.split("\\.");


            builder.append("\n");
            StringBuilder builder2 = new StringBuilder();
            while ((line = readerBlack.readLine()) != null) {
                builder.append(line).append(" ");
                builder2.append(line).append(" ");
            }
            String str2 = builder2.toString();
            String[] arr = str2.split(" ");
            for (int j = 0; j< str.length; j++){
                if (!(isBadText(str[j],arr))){
                    writer.write(str[j].strip() + ".\n");

                }
            }
        } /*catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/ catch (IOException e) {
            System.out.println(e);
        }
        return builder.toString();
    }
    private boolean isBadText(String string, String[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (string.contains(arr1[i])) {
                return false;
            }
        }
        return true;
    }
}
