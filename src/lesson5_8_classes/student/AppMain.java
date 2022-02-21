package lesson5_8_classes.student;

/*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант
отличается от студента наличием некой научной работы.
а) Класс Student содержит переменные: String firstName, lastName, group. А также, double
averageMark, содержащую среднюю оценку.
б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
Если средняя оценка студента равна 5, то сумма 100 р., иначе 80. Переопределить этот
метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 р., иначе 180.
г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать
метод getScholarship() для каждого элемента массива.*/

public class AppMain {
    public static void main(String[] args) {

        Student object = new Aspirant("Alex", "Sh", "103128", 5, true);
        object.displayScholarship();
        Student student = new Student("Sam", "N", "103148", 5);
        student.displayScholarship();
        Aspirant aspirant = new Aspirant("Bob", "G", "103118", 4, true);
        aspirant.displayScholarship();
        Student[] arr = new Student[3];
        arr[0] = object;
        arr[1] = student;
        arr[2] = aspirant;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].displayScholarship());
        }
        /*arr[0].displayScholarship();
        arr[1].displayScholarship();
        arr[2].displayScholarship();*/
    }
}
