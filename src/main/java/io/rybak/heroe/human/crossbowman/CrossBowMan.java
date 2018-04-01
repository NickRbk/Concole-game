package io.rybak.heroe.human.crossbowman;

import io.rybak.race.impl.AbstractRace;

public class CrossBowMan extends AbstractRace {
    private FightAbility[] attackTypes = FightAbility.values();

    public int attack() {
        return randomAttackType(attackTypes).getDamage();
    }

    public CrossBowMan() {
        super("Human", "crossbowman");
    }

    private FightAbility randomAttackType(FightAbility[] attackTypes) {
        int index = (int)Math.round( Math.random() * (attackTypes.length - 1) );
        return attackTypes[index];
    }

    @Override
    public AbstractRace createHeroe() {
        return new CrossBowMan();
    }
}
