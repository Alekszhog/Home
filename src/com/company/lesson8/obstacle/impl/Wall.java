package com.company.lesson8.obstacle.impl;

import com.company.lesson8.athlete.Athlete;
import com.company.lesson8.obstacle.Obstacle;

public class Wall implements Obstacle {
    private final int jumpHeight;

    public Wall(int jumpHeight) {this.jumpHeight = jumpHeight; }

    @Override
    public boolean action(Athlete athlete) {
        return athlete.jump(jumpHeight);
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}
