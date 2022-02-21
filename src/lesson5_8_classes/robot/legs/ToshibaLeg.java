package lesson5_8_classes.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(){
    }

    public ToshibaLeg(int price){
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
