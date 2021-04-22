package com.company.lesson8;

import com.company.lesson8.athlete.Athlete;
import com.company.lesson8.athlete.impl.Cat;
import com.company.lesson8.athlete.impl.Human;
import com.company.lesson8.athlete.impl.Robot;
import com.company.lesson8.obstacle.Obstacle;
import com.company.lesson8.obstacle.impl.Treadmill;
import com.company.lesson8.obstacle.impl.Wall;

public class main {

    public static void(String[] args) {
        Athlete[] athletes = {
                new Human(maxjumpHeight: 100, maxrunDistance: 100),
        new Robot(maxjumpHeight: 10, maxrunDistance: 1000),
        new Cat(maxjumpHeight: 1000, maxrunDistance: 1000)
        };

        Obstacle[] obstacles = {
                new Wall(jumpHeight: 50),
        new Wall(jumpHeight: 10),
        new Wall(jumpHeight: 500),
        new Treadmill(runDistance: 100),
        new Treadmill(runDistance: 50),
        };


    }

    private static void(Athlete[] athletes, Obstacle[] obstacles) {
        for (int i = 0; i < obstacles.length; i++) {

            System.out.println("# -----  Испытание № " + (i + 1) + " ----- #");

            for (int j = 0; j < athletes.length; j++) {

                if (athletes[j] != null) {
                    Athlete athlete = athletes[j];
                    boolean isCoped = obstacles[i].action(athlete);

                    removeAthleteIfWeak(athletes, j, isCoped);
                }
            }
        }
        System.out.println();
    }

    private static void removeAthleteIfWeak(Athlete[] athletes, int athleteIndex, boolean isCoped) {
        if (!isCoped) {
            athletes[athleteIndex] = null;
        }
    }
}
