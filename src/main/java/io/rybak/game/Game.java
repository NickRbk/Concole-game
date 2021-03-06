package io.rybak.game;

import io.rybak.race.impl.AbstractRace;
import io.rybak.team.Team;
import io.rybak.view.Message;

import java.util.Arrays;

public class Game {
    public static void start() {
        Message.welcomeInfo();

        // Define teams length
        int teamMembers = (int)Math.round( Math.random() * 3 + 3); // team members [3;6]

        // Create Teams
        Team humanTeam = new Team("Human", teamMembers);
        Team elveTeam = new Team("Elf", teamMembers);

        // Print info about Teams
        Message.teamsInfo(humanTeam, elveTeam);

        fight(humanTeam, elveTeam);

        Message.teamsInfo(humanTeam, elveTeam);
    }

    private static void fight(Team team1, Team team2) {
        int step = 1;
        while(aliveHeroes(team1.getHeroes()).length > 0 && aliveHeroes(team2.getHeroes()).length > 0) {
            AbstractRace[] enemyPair = membersToFight(aliveHeroes(team1.getHeroes()), aliveHeroes(team2.getHeroes()));

            System.out.println("\n<>Step#" + step);
            battle(enemyPair);
            step++;
        }

        if(aliveHeroes(team1.getHeroes()).length > 0) {
            Message.winInfo(team1, step - 1);
        } else {
            Message.winInfo(team2, step - 1);
        }
    }

    private static void battle(AbstractRace[] enemyPair) {

        // start fight preference hero
        int attack1 = enemyPair[0].attack();
        if(attack1 < 0) {
            // cure himself
            enemyPair[0].setHealth( enemyPair[0].getHealth() - attack1 );
            Message.cureHimself(enemyPair[0]);
        } else {
            enemyPair[1].setHealth( enemyPair[1].getHealth() - attack1 );
            Message.fightInfo(enemyPair, "---->>");
        }

        // continue fight enemy hero
        int attack2 = enemyPair[1].attack();
        if(enemyPair[1].getHealth() == 0) {
            Message.enemyDefeated(enemyPair[1]);
        } else if(attack2 < 0) {
            // cure himself
            enemyPair[1].setHealth( enemyPair[1].getHealth() - attack2 );
            Message.cureHimself(enemyPair[1]);
        } else {
            enemyPair[0].setHealth( enemyPair[0].getHealth() - attack2 );
            Message.fightInfo(enemyPair, "<<----");
        }

        if(enemyPair[0].getHealth() == 0) {
            Message.enemyDefeated(enemyPair[0]);
        }
    }

    private static AbstractRace[] membersToFight(AbstractRace[] team1, AbstractRace[] team2) {
        AbstractRace[] enemyPair = new AbstractRace[2];
        boolean heroe1IsPreference, heroe2IsPreference;

        int heroeIndexT1 = (int)Math.round( Math.random() * (team1.length - 1) );
        int heroeIndexT2 = (int)Math.round( Math.random() * (team2.length - 1) );

        // find which hero fight first
        do {
            heroe1IsPreference = team1[heroeIndexT1].isPreference();
            heroe2IsPreference = team2[heroeIndexT2].isPreference();
        } while(heroe1IsPreference == heroe2IsPreference);

        enemyPair[0] = heroe1IsPreference ? team1[heroeIndexT1] : team2[heroeIndexT2];
        enemyPair[1] = !heroe1IsPreference ? team1[heroeIndexT1] : team2[heroeIndexT2];

        // first index in enemyPair[] is preference
        return enemyPair;
    }

    private static AbstractRace[] aliveHeroes(AbstractRace[] heroes) {
        // return only alive heroes
        return Arrays.stream(heroes)
                .filter(hero -> hero.getHealth() > 0)
                .toArray(AbstractRace[]::new);
    }
}
