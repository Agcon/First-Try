package ru.agcon.iep0221;

public class Warrior extends Hero{
    public Warrior(int hp){
        super(hp);
    }

    @Override
    public String getPhrase() {
        return "Поцелуй мой гладиус";
    }
}
