package lesson18_multithreaded;

public class NewThread implements Runnable{
    private Res res;

    public NewThread(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            res.mul();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
