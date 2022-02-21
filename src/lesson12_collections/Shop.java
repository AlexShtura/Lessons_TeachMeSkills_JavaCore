package lesson12_collections;

import java.util.*;

public class Shop {
    private List<Item> items;
    private List<Person> people;


    public Shop() {
        items = new ArrayList<>();
        people = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addItem(Item item) {
        items.add(item);
        if (!isContainByIdItem(item)) {
            items.add(item);
        }
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void deleteItem(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getIdItem() == id) {
                items.remove(i);
            }
        }
    }

    public void deletePerson(int idPerson) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getIdPerson() == idPerson) {
                people.remove(i);
            }
        }
    }

    public void itemUpdate(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getIdItem() == item.getIdItem()) {
                items.set(i, item);
            }
        }
    }

    public void printerItem() {
        for (Item item1 : items) {
            System.out.printf("id: %d name: %s price: %d\n", item1.getIdItem(), item1.getName(), item1.getPrice());
        }
    }

    public void printerPerson() {
        Collections.sort(people);
        for (Person personOther : people) {
            System.out.printf("id: %d firstName: %s lastName: %s\n", personOther.getIdPerson(), personOther.getFirstName(), personOther.getLastName());
        }
    }

    private boolean isContainByIdItem(Item item) {
        for (Item value : items) {
            if (value.getIdItem() == item.getIdItem()) {
                return true;
            }
        }
        return false;
    }
}
