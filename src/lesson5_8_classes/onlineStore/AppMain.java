package lesson5_8_classes.onlineStore;

/*Создать Интернет-магазин
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
Создать объект класса User.*/

public class AppMain {
    public static void main(String[] args) {
        Category electronics = new Category("Электроника", new String[]{"Телефоны", "Наушники", "Часы"});
        Category auto = new Category("Авто", new String[]{"Шины", "Диски", "Аккумуляторы"});
        Category house = new Category("Дом", new String[]{"Смесители", "Ванны", "Кухни"});
    }
}
