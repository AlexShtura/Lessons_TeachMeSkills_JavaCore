package lesson14_streamAPI;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        Person person1 = new Person("Tom", 20, true);
        Person person2 = new Person("Alex", 30, false);
        Person person3 = new Person("Bob", 40, true);
        Person person4 = new Person("Gaga", 1, false);
        Person person5 = new Person("Ed", 15, true);
        Person person6 = new Person("Kaf", 21, false);
        Person person7 = new Person("Oleg", 36, true);
        Person person8 = new Person("Pok", 666, false);
        Person person9 = new Person("Wera", 19, true);

        System.out.println("Старше 30------------------------------------");
        List<Person> personList = List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9);
        personList.stream().filter(el -> el.getAge() > 30).forEach(el -> System.out.println(el));
        System.out.println("Женатые------------------------------------");
        List<Person> result = personList.stream().filter(el -> el.isMarried()).toList();
        result.forEach(el -> System.out.println(el));
        System.out.println("Имена длинее 3------------------------------------");
        personList.stream().map(el -> el.getName()).filter(el -> el.length()>3).forEach(el -> System.out.println(el));
        System.out.println("Сортировка по возрасту------------------------------------");
        Refactor refactor = new Refactor();
        personList.stream().sorted(refactor).forEach(el -> System.out.println(el));

    }
}
