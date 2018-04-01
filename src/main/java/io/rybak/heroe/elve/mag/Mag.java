package io.rybak.heroe.elve.mag;

import io.rybak.race.impl.Elve;

public class Mag extends Elve {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Mag() {
        super("mag");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }
}
