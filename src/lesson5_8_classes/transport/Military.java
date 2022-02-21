package lesson5_8_classes.transport;

public class Military extends Air {
    private boolean catapulting; //true/false
    private int numberOfMissiles; //pieces

    public Military() {

    }

    public Military(boolean catapulting, int numberOfMissiles) {
        this.catapulting = catapulting;
        this.numberOfMissiles = numberOfMissiles;
    }

    public Military(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, boolean catapulting, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.catapulting = catapulting;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void setCatapulting(boolean catapulting) {
        this.catapulting = catapulting;
    }

    public boolean getCatapulting() {
        return catapulting;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void display() {
        System.out.printf("Информация военный самолет: \nМощность,кВт: %.1f; \nМаксимальная скорость,км/ч: %d; \nМасса,кг: %d; " +
                        "\nМарка: %s; \nРазмах крыльев,м: %d; \nМинимальная длина взлётно-посадочной полосы для взлёта,км: %d; " +
                        "\nНаличие системы катапультирования: %b; \nКол-во ракет на борту,шт: %d.", this.countPower(), this.getMaxSpeed(),
                this.getWeight(), this.getBrand(), this.getWingspan(), this.getMinRunwayLength(), this.getCatapulting(),
                this.getNumberOfMissiles());
    }

    public void shot() {
        System.out.println();
        if (this.getNumberOfMissiles() > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapulting(){
        if (this.getCatapulting() == true){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
