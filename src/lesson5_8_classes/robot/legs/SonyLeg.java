package lesson5_8_classes.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(){
    }

    public SonyLeg(int price){
        this.price = price;
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
