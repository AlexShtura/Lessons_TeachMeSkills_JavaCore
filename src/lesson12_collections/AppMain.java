package lesson12_collections;

public class AppMain {
    public static void main(String[] args) {
        Item item1 = new Item(1,"qwe", 100);
        Item item2 = new Item(2, "asd", 200);
        Item item3 = new Item(3, "zxc", 300);
        Item item4 = new Item(1, "dfg", 234);

        //Scanner scanner = new Scanner(System.in);
    /*
    public void addPerson(Person person) {
        people.add(person);
    }
        System.out.println("Quantity people:");
        int size = scanner.nextInt();

        for (int i= 0; i <= size; i++){
            System.out.println("Index:");
            int getIdPerson() = scanner.nextInt();
            System.out.println("First Name:");
            String getFirstName() = scanner.next();
            System.out.println("Last Name:");
            String lastName = scanner.next();
            Person person = new Person();
        }*/

        Person person1 = new Person(10,"Alex","Shtura");
        Person person2 = new Person(25,"Kirill","Golovin");
        Person person3 = new Person(31,"Maks","Gorelikov");
        Person person4 = new Person(55,"Zaur","Botov");
        Person person5 = new Person(554,"Alex","Filipenko");
        Person person6 = new Person(87,"Tania","Kotova");
        Person person7 = new Person(17,"Maks","Kim");

        Shop shop = new Shop();
        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);
        shop.addItem(item4);

        shop.addPerson(person1);
        shop.addPerson(person2);
        shop.addPerson(person3);
        shop.addPerson(person4);
        shop.addPerson(person5);
        shop.addPerson(person6);
        shop.addPerson(person7);

        System.out.println("Users:");
        shop.printerPerson();
        System.out.println("Delete user 25:");
        shop.deletePerson(25);
        shop.printerPerson();



        System.out.println("Items:");
        shop.printerItem();
        System.out.println("Update items:");
        shop.itemUpdate(item1);
        shop.printerItem();
        System.out.println("Delete item:");
        shop.deleteItem(1);
        shop.printerItem();

    }
}
