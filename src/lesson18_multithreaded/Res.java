package lesson18_multithreaded;

public class Res {
    private static int num;

    public Res(){
    }

    public Res(int num) {
        this.num = num;
    }

    public static synchronized int getNum() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num;
    }

    public synchronized void mul(){
        num*=2;
        System.out.println(getNum());
    }
}
