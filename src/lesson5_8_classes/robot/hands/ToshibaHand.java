package lesson5_8_classes.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
