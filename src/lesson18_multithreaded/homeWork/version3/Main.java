package lesson18_multithreaded.homeWork.version3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String args[]){

        String filein = "D:\\Doc\\TeachMeSkills\\Projects\\inputLesson18.txt";
        String fileout = "D:\\Doc\\TeachMeSkills\\Projects\\outputLesson18.txt";
        int blocksize = 10;
        int infsize = 0;
        // проверка наличия файла, объема информации
        try (FileInputStream fstream = new FileInputStream(new File(filein))) {
            infsize = fstream.available();
        } catch (IOException exc) {
            exc.printStackTrace();
            return;
        }

        ThreadGroup tg = new ThreadGroup("Copiers"); // создание группы потоков
        int tnum = 0, pos = 0;
        // запуск потоков
        while (true){
            if ((pos + blocksize) < infsize) // определение величины блока
                new Copier(tg, tnum++, filein, fileout, pos, blocksize).start(); // в полный блок
            else{
                new Copier(tg, tnum++, filein, fileout, pos, infsize - pos).start(); // в остаток
                break;
            }
            pos += blocksize;
        }

        while (tg.activeCount() > 0); // ожидание завершения потоков группы

    }

}