package lesson18_multithreaded;

public class AppMain {
    public static void main(String[] args) {
        Res res = new Res(1);
        Res next = new Res(1);
        NewThread newThread = new NewThread(res);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(newThread);
            thread.start();
        }
        NewThread nextThread = new NewThread(next);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(nextThread);
            thread.start();
        }
    }
}
