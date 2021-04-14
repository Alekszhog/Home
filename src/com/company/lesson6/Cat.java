package com.company.lesson6;

public class Cat extends Animal {
    public Cat(String name, int swimLength, int runLength) {
        super(name, swimLength, runLength);

    }

    @Override
    public void run(int length) {
       if (runPossiblelength > lenghts) {
           System.out.println("Кот " + name + " пробежал все" (" + length  + ")");
       } else {
           System.out.println(name  + " не смог");
       }
    }
    @Override
    public void swim(int length) {
            System.out.println("Кот не плавает");
        }
}
