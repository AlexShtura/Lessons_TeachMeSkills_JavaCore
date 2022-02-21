package lesson16_regularExpressions;

public class PatternIPV4 {
    public static void main(String[] args) {
        System.out.println(isIPv4("000"));
    }

    private static boolean isIPv4(String input) {

        boolean result = input.matches("(([0-2][0-5][0-5])|([0-2][0-4][0-9])|([0-1][0-9][0-9]))&([^0{3}])");
        return result;
    }
//(([0-2][0-5][0-5])|([0-2][0-4][0-9])|([0-1][0-9][0-9]))
}
