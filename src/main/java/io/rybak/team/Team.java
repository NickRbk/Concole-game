package io.rybak.team;

import io.rybak.heroe.elf.archer.Archer;
import io.rybak.heroe.human.crossbowman.CrossBowMan;
import io.rybak.heroe.human.mag.Mag;
import io.rybak.heroe.human.warrior.Warrior;
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

    private AbstractRace[] elveHeroes = {
            new Archer(),
            new io.rybak.heroe.elf.mag.Mag(),
            new io.rybak.heroe.elf.warrior.Warrior()
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

            selectedHeroes[i] = allHeroes[index].createHeroe();
            i++;
        }

        return selectedHeroes;
    }

    private AbstractRace[] findRaceHeroes(@NonNull String race) {
        if(race.equals("Elve")) {
            return this.elveHeroes;
        }
        return this.humanHeroes;
    }

    // Function to print all members name in team
    private String heroesTeam() {
        String[] heroesName = new String[heroes.length];

        for(int i = 0; i < heroes.length; i++) {
            heroesName[i] = String.format("%s (%d)", heroes[i].getHeroeName(), heroes[i].getHealth());
        }

        return String.join(", ", heroesName);
    }
}
