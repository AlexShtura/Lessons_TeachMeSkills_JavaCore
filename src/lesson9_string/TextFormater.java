package lesson9_string;

public class TextFormater {
    public static void main(String[] args) {
        String text = "I studied General Medicine in Ukraine and I'm currently residing " +
                "there as well. I am passionate about meeting new people and learning " +
                "about their cultures. I love to have fun and see people happy. I am a " +
                "sports fan and my favorite sport is football. ";
        String[] cutText = text.split("\\. ");
        int counter = 0;
        for (int i = 0; i < cutText.length; i++){
            counter++;
        }
        System.out.println(counter);
    }
}
