package lesson13_lambdaExpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", LocalDate.of(1989, 8, 3));
        Person person2 = new Person("Ivan", "Sidorov", LocalDate.of(1976, 9, 19));
        Person person3 = new Person("Alex", "Smirnov", LocalDate.of(1993, 4, 22));
        Person person4 = new Person("Mike", "Petrov", LocalDate.of(1998, 4, 3));
        Person person5 = new Person("Andre", "Popov", LocalDate.of(2002, 9, 25));

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        for (Person el : people) {
            System.out.println(el);
        }

        System.out.println("После сортировки:");
        BirthdayComparator comparator1 = new BirthdayComparator();
        people.sort(comparator1);

        for (Person el : people) {
            System.out.println(el);
        }
    }
}
