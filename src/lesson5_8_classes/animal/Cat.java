package lesson5_8_classes.animal;

public class Cat extends Animal {
    private String kindCat;
    private String colorCat;

    public Cat() {
    }

    public Cat(String food, String location, String kindCat, String colorCat) {
        super(food, location);
        this.kindCat = kindCat;
        this.colorCat = colorCat;
    }

    public String getKindCat() {
        return kindCat;
    }

    public void setKindCat(String kindCat) {
        this.kindCat = kindCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getKindCat() + " шумит!");
    }

    @Override
    public void eat() {
        System.out.println(this.getKindCat() + " ест!");
    }

    @Override
    public void sleep() {
        System.out.println(this.getKindCat() + " спит!");
    }
}
