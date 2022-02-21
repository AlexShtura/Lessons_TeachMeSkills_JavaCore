package lesson5_8_classes.transport;

public class MainTransport {
    public static void main(String[] args) {
        Passenger auto = new Passenger(100,250, 2000, "Audi", 4,
                8.0, "sedan", 5);
        auto.display();
        auto.result();

        System.out.println();

        Cargo auto1 = new Cargo(500, 100, 3500, "Belaz", 6, 30, 24);
        auto1.display();
        auto1.countCargo();

        System.out.println();

        Civil plant = new Civil(1000,700,10000,"Boing",40, 5,350, false);
        plant.display();
        plant.countNumberOfPassenger();

        System.out.println();

        Military plant1 = new Military(700,1500,5000, "Миг-32", 25, 1, false,0);
        plant1.display();
        plant1.shot();
        plant1.catapulting();
    }

}
