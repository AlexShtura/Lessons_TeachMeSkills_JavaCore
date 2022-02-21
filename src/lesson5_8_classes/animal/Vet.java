package lesson5_8_classes.animal;

public class Vet {

    Animal dog = new Dog("кость", "будка", "цвергшнауцер", "перец с солью");
    Animal cat = new Cat("кошачий корм", "дом", "британец", "цвет морской волны");
    Animal horse = new Horse("сено", "конюшня", "арабский скакун", "черный");

    public void treatAnimal(Animal animal) {
        if (this.dog == animal) {
            System.out.println("Сделать обследование. Дать " + dog.getFood() + ". Местоположение - " + dog.getLocation());
        } else if (this.cat == animal) {
            System.out.println("Сделать обследование. Дать " + cat.getFood() + ". Местоположение - " + cat.getLocation());
        } else if (this.horse == animal) {
            System.out.println("Сделать обследование. Дать " + horse.getFood() + ". Местоположение - " + horse.getLocation());
        } else {
            System.out.println("Такого животного у вас нет");
        }
    }
}
