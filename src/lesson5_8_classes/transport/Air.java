package lesson5_8_classes.transport;

public abstract class Air extends Transport{
    private int wingspan; //meter
    private int minRunwayLength; //km

    public Air(){
    }

    public Air (int wingspan, int minRunwayLength){
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public Air(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength){
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }
}
