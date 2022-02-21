package lesson5_8_classes.transport;

public abstract class Transport {
    private int power; //hp
    private int maxSpeed; //km/h
    private int weight; //kg
    private String brand; //for ex.Audi, BMW, MAZ

    public Transport (){
    }

    public Transport (int power, int maxSpeed, int weight, String brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public double countPower(){
        return this.getPower()*0.74;
    }

}


