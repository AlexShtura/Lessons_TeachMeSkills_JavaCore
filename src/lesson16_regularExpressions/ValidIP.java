package lesson16_regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIP {
    public static void main(String[] args) {
        System.out.println(isIPv4("280"));
    }
    public static boolean isIPv4(String input) {
        //198.123.165.14(+);263.244.244.12(-); 198.266.122.00(-);011.001.255.12(+);


        Pattern p = Pattern.compile("((25[0-5])|(2[0-4][0-9])|(1[0-9][0-9])|(0[1-9][0-9])|(0{2}[1-9])|[^0{3}])");
        Matcher m = p.matcher(input);
        //boolean result = input.matches("(([0-2][0-5][0-5])|([0-2][0-4][0-9])|([0-1][0-9][0-9]))&([^0{3}])");
        //(([1-2][0-5][0-5])|([0-2][0-4][0-9])|([0-1][0-9][0-9]))
        return m.find();

    }
}
