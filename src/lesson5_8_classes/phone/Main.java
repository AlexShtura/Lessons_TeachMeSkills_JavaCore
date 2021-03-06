package lesson5_8_classes.phone;

/*Класс Phone.
а) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
д) Добавить конструктор в класс Phone, который принимает на вход три параметра для
инициализации переменных класса - number, model и weight.
е) Добавить конструктор, который принимает на вход два параметра для инициализации
переменных класса - number, model.
ж) Добавить конструктор без параметров.
з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя
звонящего и номер телефона звонящего. Вызвать этот метод.
Тут подробнее про перегрузку и переопределение методов:
Ссылка-1 Ссылка-2 Ссылка-3
к) Создать метод sendMessage с аргументами переменной длины.
Тут подробнее про аргументы переменной длины: Что такое аргументы переменной длины
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.
л) Изменить класс Phone в соответствии с концепцией JavaBean.*/

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("+375298566777", "htc", 120);
        Phone phone1 = new Phone("+375298566888", "Sony", 150);
        Phone phone2 = new Phone("+375298566999", "LG", 220);
        phone.display();
        System.out.println();
        phone1.display();
        System.out.println();
        phone2.display();

        String name = "Gosha";
        phone.receiveCall(name);
        phone1.receiveCall("Sania");
        phone2.receiveCall("Maks");
        String n = phone2.getNumber();
        System.out.println();
        phone.receiveCall("Miha", "258784651");
        System.out.println();
        phone.sentMessage("51551515", "654465465", "5454564556");
        System.out.println();
        System.out.println(phone);
    }
}
