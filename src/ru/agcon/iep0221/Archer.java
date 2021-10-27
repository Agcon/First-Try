package ru.agcon.iep0221;

public class Archer extends Hero{
    public Archer(){
        super(100);
    }

    @Override
    public String getPhrase() {
        return "Hello, i'm fucking archer";
    }
}
