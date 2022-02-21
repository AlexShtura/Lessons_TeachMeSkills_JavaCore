package lesson9_string;

public class String4 {
    public static void main(String[] args) {
        String text = "My name is Afowedeli Animios. I studied General Medicine in Ukraine " +
                "and I'm currently residing there as well. I am passionate about meeting " +
                "new people and learning about their cultures. I love to have fun and see " +
                "people happy. I am a sports fan and my favorite sport is football. ";
        String[] s = text.split("\\. ");
        for (int i = 0; i < s.length; i++) {
            String[] s2 = s[i].split(" ");
            if (s2.length >= 3 && s2.length <= 9) {
                System.out.println(s[i]);
            }
        }
    }
}

