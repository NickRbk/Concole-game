package io.rybak.team;

import io.rybak.hero.elf.archer.Archer;
import io.rybak.hero.human.crossbowman.CrossBowMan;
import io.rybak.hero.human.mag.Mag;
import io.rybak.hero.human.warrior.Warrior;
import io.rybak.race.impl.AbstractRace;
import lombok.Getter;
import lombok.NonNull;

public class Team {
    @Getter
    AbstractRace[] heroes;

    @Getter
    String name;

    // Predefine arrays of heroes for each race
    private AbstractRace[] humanHeroes = {
            new Mag(),
            new Warrior(),
            new CrossBowMan()
    };

    private AbstractRace[] elfHeroes = {
            new Archer(),
            new io.rybak.hero.elf.mag.Mag(),
            new io.rybak.hero.elf.warrior.Warrior()
    };

    // Create custom constructor to create Team
    public Team(String race, int teamMembers) {
        this.heroes = createTeam(race, teamMembers);
        this.name = race;
    }

    @Override
    public String toString() {
        return String.format("\n\tTeam of %s race, members: %d\n\t\t--> %s",
                heroes[0].getRace(), heroes.length, heroesTeam());
    }

    private AbstractRace[] createTeam(String race, int teamMembers) {
        AbstractRace[] selectedHeroes = new AbstractRace[teamMembers];
        AbstractRace[] allHeroes = findRaceHeroes(race);

        for(int i = 0; i < teamMembers;) {
            int index = (int)Math.round( Math.random() * (allHeroes.length - 1) );

            selectedHeroes[i] = allHeroes[index].createHero();
            i++;
        }

        return selectedHeroes;
    }

    private AbstractRace[] findRaceHeroes(@NonNull String race) {
        if(race.equals("Elf")) {
            return this.elfHeroes;
        }
        return this.humanHeroes;
    }

    // Function to print all members name in team
    private String heroesTeam() {
        String[] heroesName = new String[heroes.length];

        for(int i = 0; i < heroes.length; i++) {
            heroesName[i] = String.format("%s (%d)", heroes[i].getHeroName(), heroes[i].getHealth());
        }

        return String.join(", ", heroesName);
    }
}
