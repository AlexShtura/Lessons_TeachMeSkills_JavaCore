package lesson5_8_classes.com.company.professions;

import lesson5_8_classes.com.company.vehicles.Person;

public class Driver extends Person {
    private int driveYears;

    public Driver() {
    }

    public Driver(int age, String fullName, int driveYears) {
        super(age, fullName);
        this.driveYears = driveYears;
    }

    public int getDriveYears() {
        return driveYears;
    }

    public void setDriveYears(int driveYears) {
        this.driveYears = driveYears;
    }
}
