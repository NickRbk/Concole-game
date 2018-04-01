package io.rybak.heroe.elve.warrior;

import io.rybak.race.impl.Elve;

public class Warrior extends Elve {
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
