package ru.agcon.iep0221;

public class Tower implements Damager{

    @Override
    public void takeDamage(int damage) {
        System.out.println("Ловим плюху " + damage);
    }
}
