package lesson5_8_classes.onlineStore;

public class Category {
    private String name;
    private String[] arr;

    public Category() {
    }

    public Category(String name, String[] arr) {
        this.name = name;
        this.arr = arr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
