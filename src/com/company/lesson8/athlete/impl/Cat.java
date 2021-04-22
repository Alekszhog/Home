package com.company.lesson8.athlete.impl;

import com.company.lesson8.athlete.Athlete;

public class Cat implements Athlete {

    private final int maxJumpHeight;
    private final int maxRunDistance;

    public Cat(int maxJumpHeight, int maxRunDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance > maxRunDistance) {
            System.out.println("Кот не смог пробежать");
            return false;
        } else {
            System.out.println("Кот смог пробежать");
            return true;
        }
    }

    @Override
    public boolean jump(int jumpHeight) {
        if (jumpHeight > maxJumpHeight) {
            System.out.println("Кот не смог перепрыгнуть");
            return false;
        } else {
            System.out.println("Кот смог перепрыгнуть");
            return true;
        }
    }
}
