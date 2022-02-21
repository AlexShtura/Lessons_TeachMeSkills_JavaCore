package lesson5_8_classes.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg() {
    }

    public SamsungLeg(int prise) {
        this.price = prise;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
