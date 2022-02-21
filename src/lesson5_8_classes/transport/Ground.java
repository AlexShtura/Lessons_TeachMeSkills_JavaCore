package lesson5_8_classes.transport;

public abstract class Ground extends Transport {
    private int numberOfWheels; //pieces
    private double fullConsumption; //L/100km

    public Ground() {
    }

    public Ground(int numberOfWheels, double fullConsumption) {
        this.numberOfWheels = numberOfWheels;
        this.fullConsumption = fullConsumption;
    }

    public Ground(int power, int maxSpeed, int weight, String brand, int numberOfWheels, double fullConsumption){
        super (power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fullConsumption = fullConsumption;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setFullConsumption(double fullConsumption) {
        this.fullConsumption = fullConsumption;
    }

    public double getFullConsumption() {
        return this.fullConsumption;
    }
}
