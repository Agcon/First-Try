package ru.agcon.iep0221;

public class Calculator {
    private int current = 0;

    public int sum(int number){
        current += number;
        return current;
    }
    public int getCurrent(){
        return current;
    }
}
