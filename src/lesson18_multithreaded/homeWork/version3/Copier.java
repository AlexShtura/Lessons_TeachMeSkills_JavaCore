package lesson18_multithreaded.homeWork.version3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Copier extends Thread{

    private String in, out;
    private int lenght;
    private long pos;

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public Copier(ThreadGroup tg, int number, String in, String out, int pos, int lenght) {
        super(tg, "Block " + number); // конструктор Thread, для группы потоков и имени потока
        this.in = in;
        this.out = out;
        this.pos = pos;
        this.lenght = lenght;
    }

    @Override
    public void run() {
        // создание автозакр. потоков на чтение и запись с произвольным доступом
        try (RandomAccessFile input = new RandomAccessFile(new File(in), "r")){ // читающий поток
            try (RandomAccessFile output = new RandomAccessFile(new File(out), "rw")){ // пишущий поток
                byte[] buffer = new byte[lenght]; // массив по размеру блока
                input.seek(pos); // установка позиции для чтения
                input.read(buffer); // чтение в массив
                output.seek(pos); // установка позиции для письма
                output.write(buffer); // запись из массива
            }
        } catch (IOException exc) {
            System.out.println(getName() + "error...");
        }
        System.out.println(getName() + " complete...");
    }

}