package io.rybak.heroe.elve.mag;

import io.rybak.race.impl.AbstractRace;

public class Mag extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Mag() {
        super("Elve", "mag");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }
}
