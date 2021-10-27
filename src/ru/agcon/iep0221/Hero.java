package ru.agcon.iep0221;

public abstract class Hero implements Damager {

    private int hp;
    private DeathNotifier deathNotifier;

    public Hero(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public abstract String getPhrase();

    public void applyDamage(int damage) {
        hp -= damage;
        if (!isAlive() && deathNotifier != null) deathNotifier.newDeath(this);
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void setDeathNotifier(DeathNotifier deathNotifier) {
        this.deathNotifier = deathNotifier;
    }

    @Override
    public void takeDamage(int damage) {
        this.applyDamage(damage);
    }

    @Override
    public String toString() {
        return "Hero{ " +
                "phrase " + getPhrase() +
                " hp = " + hp +
                " alive? " + (isAlive() ? "Живёхонек " : "Откис ") +
                '}';
    }

}
