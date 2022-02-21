package lesson5_8_classes.reader;

public class Reader {
    private String fullName;
    private int number;
    private String faculty;
    private String birthDay;
    private String phoneNumber;

    public Reader() {
    }

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public Reader(String fullName, int number, String faculty, String birthDay, String phoneNumber) {
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String fullName, int countBook) {
        System.out.printf("%s взял, %d книги", this.fullName, countBook);
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " взял книги");
        for (Book a : books) {
            System.out.println(a.getType() + ", ");
        }
    }

}
