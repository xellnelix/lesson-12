package ru.otus.lesson12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Test1", 15),
                new Cat("Test2", 30),
                new Cat("Test3", 100),
                new Cat("Test4", 200),
                new Cat("Test5", 30)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i]);
        }
        System.out.println(plate);
        plate.addFoodQuantity(50);
        System.out.println(plate);
    }
}
