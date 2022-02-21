package lesson14_streamAPI;

import java.util.Comparator;

public class Refactor implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }
        if (o1.getAge() < o2.getAge()){
            return -1;
        }
        return 0;
    }
}
