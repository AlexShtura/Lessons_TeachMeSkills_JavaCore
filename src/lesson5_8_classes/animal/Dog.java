package lesson5_8_classes.animal;

public class Dog extends Animal {
    private String kindDog;
    private String colorDog;

    public Dog() {
    }

    public Dog(String food, String location, String kindDog, String colorDog) {
        super(food, location);
        this.kindDog = kindDog;
        this.colorDog = colorDog;
    }

    public String getKindDog() {
        return kindDog;
    }

    public void setKindDog(String kindDog) {
        this.kindDog = kindDog;
    }

    public String getColorDog() {
        return colorDog;
    }

    public void setColorDog(String colorDog) {
        this.colorDog = colorDog;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.getKindDog() + " шумит!");
    }

    @Override
    public void eat() {
        System.out.println(this.getKindDog() + " ест!");
    }

    @Override
    public void sleep() {
        System.out.println(this.getKindDog() + " спит!");
    }
}
