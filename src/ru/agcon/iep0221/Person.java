package ru.agcon.iep0221;

public class Person {
    private static int lastID;

    private String name;
    private double heightInMeter = 1.8;
    private static double soShortPeople = 1.2;
    private static double ShortPeople = 1.5;
    private final int ID;

    public Person(String name){
        ID = lastID++;
        if (name == null || name.length() == 0) name = "Default#" + ID;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getID() {
        return ID;
    }

    public static void setHeightPoints(double soShortPeople, double ShortPeople){
        Person.soShortPeople = soShortPeople;
        Person.ShortPeople = ShortPeople;
    }

    public String getHeightFunny() {
        if (this.heightInMeter < Person.soShortPeople){
            return "Микрочел";
        }
        if (heightInMeter < ShortPeople){
            return "Балтос";
        }
        return "Норм чел";
    }

    public void setHeightInMeter(double heightInMeter) {
        this.heightInMeter = heightInMeter;
    }
    public double getHeightInMeter(){
        return heightInMeter;
    }
}
