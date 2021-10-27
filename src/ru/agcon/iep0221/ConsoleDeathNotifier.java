package ru.agcon.iep0221;

public class ConsoleDeathNotifier implements DeathNotifier {
    @Override
    public void newDeath(Hero hero) {
        System.out.println("hero " + hero + "died");
    }
}
