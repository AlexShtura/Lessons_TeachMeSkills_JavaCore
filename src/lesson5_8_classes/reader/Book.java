package lesson5_8_classes.reader;

public class Book {
    private String type;
    private String aName;

    public Book() {
    }

    public Book(String type) {
    }

    public void Book(String aName) {
        this.aName = aName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}
