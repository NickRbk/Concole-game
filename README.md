## Console game: Battle of Race

#### Description
This is a console game in which app created 2 teams of heroes of particular Race: 
_Human_ and _Elf_.

**Human** race has the below heroes:
- _mag_, fight ability: 
    - cure himself (+ 9HP);
    - attack with magic (- 9HP);
- _crossbowman_, fight ability:
    - shoot a crossbow (- 11 HP);
    - attack (- 7HP);
- _warrior_, fight ability:
    - attack with a sword (- 11HP).

**Elf** race has:
- _mag_, fight ability: 
    - cure himself (+ 7HP);
    - attack with magic (- 9HP);
- _archer_, fight ability:
    - shoot from the bow (- 12HP)
    - attach (- 8HP);
- _warrior_, fight ability:
    - attack with a sword (- 23HP).

App creates two teams of particular race. Each team include from 3 to 6 members 
(_define randomly_).

Members for team choose also randomly from the array of heroes in particular Race.

App randomly choose enemy pair for battle, and which one fight first.. also randomly.

When the enemy pair defined fight started and which type of attack defined arbitrary too.

The team which lose all their heroes (health == 0) fail the game.

#### Prerequisites:
- install [Maven](https://maven.apache.org/download.cgi). 

#### How to start up ?
- git clone
- build the maven project ```mvn package```
- start app with the below cmd
          
            java -cp target/Battle-of-Race-1.0-SNAPSHOT.jar io.rybak.StartGame
