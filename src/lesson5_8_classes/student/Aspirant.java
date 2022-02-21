package lesson5_8_classes.student;

public class Aspirant extends Student {

    private boolean scienceWork;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public boolean isScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(boolean scienceWork) {
        this.scienceWork = scienceWork;
    }

    public void displayAspirant() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + ". Group: " + this.getGroup());
        System.out.println("Average mark: " + this.getAverageMark());
        System.out.println("Science work: " + this.scienceWork);
    }

    @Override
    public int getScholarship() {
        int bunRub;
        if (getAverageMark() == 5) {
            bunRub = 200;
        } else {
            bunRub = 180;
        }
        return bunRub;
    }
}
