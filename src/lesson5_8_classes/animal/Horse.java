package lesson5_8_classes.animal;

public class Horse extends Animal {
    private String kindHorse;
    private String colorHorse;

    public Horse() {
    }

    public Horse(String food, String location, String kindHorse, String colorHorse) {
        super(food, location);
        this.kindHorse = kindHorse;
        this.colorHorse = colorHorse;
    }

    public String getKindHorse() {
        return kindHorse;
    }

    public void setKindHorse(String kindHorse) {
        this.kindHorse = kindHorse;
    }

    public String getColorHorse() {
        return colorHorse;
    }

    public void setColorHorse(String colorHorse) {
        this.colorHorse = colorHorse;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getKindHorse() + " шумит!");
    }

    @Override
    public void eat() {
        System.out.println(this.getKindHorse() + " ест!");
    }

    @Override
    public void sleep() {
        System.out.println(this.getKindHorse() + " спит!");
    }
}
