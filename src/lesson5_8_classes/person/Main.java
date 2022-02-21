package lesson5_8_classes.person;

/*Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то
Person говорит".
в) Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
другой - Person(fullName, age).*/

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sam", 38);

        person.move();
        person.talk();
        System.out.println();

        Person person1 = new Person();

        person1.move();
        person1.talk();
    }
}
