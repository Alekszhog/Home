package com.company.lesson6;

public abstract class Animal {
    protected final String name;
    protected final int swimPossibleLenght;
    protected final int runPossibleLenght;
    public Animal(String name, int swimPossibleLenght, int runPossibleLenght) {
        this.name = name;
        this.swimPossibleLenght = swimPossibleLenght;
        this.runPossibleLenght = runPossibleLenght;
    }
    public String getName() { return name; }
    public int swimPossibleLenght() { return swimPossibleLenght; }
    public int runPossibleLenght() { return runPossibleLenght; }
}
