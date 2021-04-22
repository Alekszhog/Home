package com.company.lesson8.obstacle.impl;

import com.company.lesson8.athlete.Athlete;
import com.company.lesson8.obstacle.Obstacle;

public class Treadmill implements Obstacle {
    private final int runDistance;

    public Treadmill(int runDistance) {this.runDistance = runDistance; }

    @Override
    public boolean action(Athlete athlete) {
        return athlete.run(runDistance);
    }

    public int getRunDistance() {
        return runDistance;
    }
}
