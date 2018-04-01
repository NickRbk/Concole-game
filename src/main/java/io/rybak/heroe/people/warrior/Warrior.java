package io.rybak.heroe.people.warrior;

import io.rybak.race.impl.People;

public class Warrior extends People {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Warrior() {
        super("warrior");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }
}
