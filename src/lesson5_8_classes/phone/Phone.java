package lesson5_8_classes.phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println(this.number + "\n" + this.model + "\n" + this.weight);
    }

    public void receiveCall(String name) {
        System.out.println("Call" + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Call" + name + " " + number);
    }

    public void sentMessage(String... numbers) {
        System.out.println("Номер тел ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
