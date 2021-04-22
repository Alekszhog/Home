package com.company.lesson8.athlete.impl;

import com.company.lesson8.athlete.Athlete;

public class Robot implements Athlete {

    private final int maxJumpHeight;
    private final int maxRunDistance;

    public Robot(int maxJumpHeight, int maxRunDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean run(int runDistance) {
        if (runDistance > maxRunDistance) {
            System.out.println("Робот не смог пробежать");
            return false;
        } else {
            System.out.println("Робот смог пробежать");
            return true;
        }
    }

    @Override
    public boolean jump(int jumpHeight) {
        if (jumpHeight > maxJumpHeight) {
            System.out.println("Робот не смог перепрыгнуть");
            return false;
        } else {
            System.out.println("Робот смог перепрыгнуть");
            return true;
        }
    }
}
