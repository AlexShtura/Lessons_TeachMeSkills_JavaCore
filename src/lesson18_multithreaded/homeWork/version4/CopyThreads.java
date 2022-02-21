package lesson18_multithreaded.homeWork.version4;

import java.io.File;
import java.io.IOException;

public class CopyThreads implements Runnable {
    private File in;
    private File out;
    private int start;
    private int stop;

    public CopyThreads() {
    }

    public CopyThreads(File in, File out, int start, int stop) {
        this.in = in;
        this.out = out;
        this.start = start;
        this.stop = stop;
    }

    public File getIn() {
        return in;
    }

    public void setIn(File in) {
        this.in = in;
    }

    public File getOut() {
        return out;
    }

    public void setOut(File out) {
        this.out = out;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        try {
            FileOperations.fileCopy(in, out, start, stop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
