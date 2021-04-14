package com.company.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat  = new Cat(name "Барсик", appetite 15);
        Plate plate = new Plate(foodValue 100);
        cat.eat(plate);
        plate.decreaseFood(countEatFood 15);
        plate.info();
        plate.addFood(countFood 20);
        plate.info();
    }
}
