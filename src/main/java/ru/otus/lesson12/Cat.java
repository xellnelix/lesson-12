package ru.otus.lesson12;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isHungry;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isHungry = true;
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name="  + name +
                ", isHungry=" + isHungry;
    }

    public void eat(Plate plate) {
        if (!plate.reduceFoodQuantity(appetite)) {
            System.out.println("Кот " + name + " не притронулся к еде");
            return;
        }
        isHungry = false;
        System.out.println("Коту/кошке " + name + " удалось поесть");

    }


}
