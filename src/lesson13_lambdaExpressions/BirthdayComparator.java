package lesson13_lambdaExpressions;

import java.util.Comparator;


public class BirthdayComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        if (o1.getBirthday().isAfter(o2.getBirthday())) {
            return 1;
        }
        if (o1.getBirthday().isBefore(o1.getBirthday())) {
            return -1;
        }
        return 0;
    }
}

