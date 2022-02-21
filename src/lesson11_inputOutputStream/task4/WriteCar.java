package lesson11_inputOutputStream.task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс.*/

public class WriteCar {
    public static void main(String[] args) {
        CarLesson11 car1 = new CarLesson11("BMW",280,35000);
        CarLesson11 car2 = new CarLesson11("Audy", 250, 32000);

        try {
            FileOutputStream fos = new FileOutputStream("car.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(car1);
            oos.writeObject(car2);

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
