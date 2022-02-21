package lesson5_8_classes.animal;

/*Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит
переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например,
может выводить на консоль "Такое-то животное спит". Dog, Cat, Horse переопределяют
методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие
только этих животных. Создайте класс Ветеринар, в котором определите метод
void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location
пришедшего на прием животного. В методе main создайте массив типа Animal, в который
запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.*/

public class AppMain {
    public static void main(String[] args) {

        Vet vet = new Vet();

        Animal[] array = {vet.dog, vet.cat, vet.horse};
        for (Animal animal : array) {
            vet.treatAnimal(animal);
        }
    }
}
