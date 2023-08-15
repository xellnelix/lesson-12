package ru.otus.lesson12;

public class Plate {
    private final int maxFoodQuantity;
    private int foodQuantity;

    public Plate(int maxFood) {
        this.maxFoodQuantity = maxFood;
        foodQuantity = maxFood;
    }

    @Override
    public String toString() {
        return "Plate: " +
                "maxFoodQuantity=" + maxFoodQuantity +
                ", foodQuantity=" + foodQuantity;
    }


    public void addFoodQuantity(int foodQuantity) {
        if (foodQuantity <= 0) {
            System.out.println("Неверное количество еды");
            return;
        }
        if (this.foodQuantity + foodQuantity > maxFoodQuantity) {
            System.out.println("Нельзя положить еды больше емкости тарелки");
            return;
        }
        this.foodQuantity += foodQuantity;
        System.out.println("Добавили в тарелку " + foodQuantity + " еды");
    }

    public boolean reduceFoodQuantity(int foodQuantity) {
        if (foodQuantity <= 0) {
            System.out.println("Неверное количество еды");
            return false;
        }
        if (this.foodQuantity - foodQuantity < 0) {
            System.out.println("Такого количества еды в тарелке нет");
            return false;
        }
        this.foodQuantity -= foodQuantity;
        return true;
    }
}
