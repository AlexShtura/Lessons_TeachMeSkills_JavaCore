package lesson12_collections;

public class Person implements Comparable<Person>{
    private int idPerson;
    private String firstName;
    private String lastName;

    public Person(int idPerson, String firstName, String lastName) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person another) {
        int res = this.firstName.compareTo(another.firstName);
        if (res == 0){
            res = this.lastName.compareTo(another.lastName);
        }
        return res;
    }
}
