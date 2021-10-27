package ru.agcon.iep0221;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hero[] army = {
                new Warrior(500),
                new Archer(),
                new Archer(),
                new Warrior(1000)
        };

        ConsoleDeathNotifier consoleDeathNotifier = new ConsoleDeathNotifier();
        army[3].setDeathNotifier(consoleDeathNotifier);

        applySomeDamage(army);
        Tower tower = new Tower();
        applySomeDamage(army[0], army[2], tower);
        for (Hero h: army){
            System.out.println(h);
        }
    }

    private static void applySomeDamage(Damager... army) {
        Random random = new Random();
        for (Damager damager : army){
            int damage = Math.abs(random.nextInt() % 200);
            System.out.println(damage);
            damager.takeDamage(damage);
            System.out.println("********************");
        }
    }

    private static void Work() {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5));
        System.out.println(calc.getCurrent());
    }
}