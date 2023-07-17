import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void removeToy(Toy toy) {
        toys.remove(toy);
    }

    public List<Toy> getToys() {
        return toys;
    }

    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        // Создание игрушек
        Toy toy1 = new Toy("Мяч", 10.99);
        Toy toy2 = new Toy("Кукла", 15.99);
        Toy toy3 = new Toy("Машинка", 12.99);

        // Добавление игрушек в магазин
        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);

        // Вывод списка игрушек в магазине
        List<Toy> toysInStore = toyStore.getToys();
        for (Toy toy : toysInStore) {
            System.out.println("Игрушка: " + toy.getName() + ", Цена: " + toy.getPrice());
        }
    }
}

class Toy {
    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}