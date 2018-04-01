package io.rybak.heroe.elve.archer;

import io.rybak.race.impl.AbstractRace;

public class Archer extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public Archer() {
        super("Elve race", "archer");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }
}
