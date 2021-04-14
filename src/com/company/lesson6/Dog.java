package com.company.lesson6;

public class Dog {
    public class Dog extends Animal {
        public Dog(String name, int swimLength, int runLength) {
            super(name, swimLength, runLength);

        }

        @Override
        public void run(int length) {
            if (runPossiblelength > lenghts) {
                System.out.println("Собака " + name + " пробежал все" (" + length  + ")");
            } else {
                System.out.println(name  + " не смог");
            }
        }
        @Override
        public void swim(int length) {
            if (swimpossiblelength > lenghts) {
                System.out.println("Собака " + name + " проплыл все" (" + length  + ")");
            } else {
                System.out.println(name + " не смог");
            }
        }
}
