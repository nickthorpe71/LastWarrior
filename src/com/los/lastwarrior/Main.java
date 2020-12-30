package com.los.lastwarrior;

import com.los.lastwarrior.tournament.Round;
import com.los.lastwarrior.warrior.Warrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();

        System.out.println("\nWarrior1 ---- \n" + warrior1.toString());
        System.out.println("\nWarrior2 ---- \n" + warrior2.toString());

        Round round1 = new Round(warrior1, warrior2);
        round1.execute();

        // This needs to be added to the battleLog of the round and Round should include a "summary" method that only prints this info plus the time of the battle and other summary info
        // START
        Warrior winner = round1.getWinner();
        Warrior loser = round1.getLoser();

        System.out.println("\nThe winner is " + winner.getFirstName() + " " + winner.getLastName() + " with " + winner.getHp() + " hp remaining!");
        System.out.println("The loser is " + loser.getFirstName() + " " + loser.getLastName() + " may they RIP\n");

        System.out.println(warrior1.getFirstName() + " Stats:");
        System.out.println(round1.getW1SwingCount() + " total swings");
        System.out.println(round1.getW1MissCount() + " misses");
        System.out.println((round1.getW1SwingCount() - round1.getW1MissCount()) + " connections");
        System.out.println(round1.getW1TotalDamage() + " total damage");
        System.out.println((round1.getW1TotalDamage() / (round1.getW1SwingCount() - round1.getW1MissCount()))  + " average damage per hit\n");

        System.out.println(warrior2.getFirstName() + " Stats:");
        System.out.println(round1.getW2SwingCount() + " total swings");
        System.out.println(round1.getW2MissCount() + " misses");
        System.out.println((round1.getW2SwingCount() - round1.getW2MissCount()) + " connections");
        System.out.println(round1.getW2TotalDamage() + " total damage");
        System.out.println((round1.getW2TotalDamage() / (round1.getW2SwingCount() - round1.getW2MissCount()))  + " average damage per hit\n");


        System.out.println("Total round time: " + round1.getRoundTime());
        // END
    }
}

// todo:
// 1. name gen - complete
// 2. warrior base stats and class check python code for base - complete
// 3. enemy base stats - complete
// 4. simple battle (use blackjack/python code as an example) - complete
// 5. change cm to feet/inches for display
// 6. Tournaments contain Levels which contain Rounds
// 7. Logging for tournaments, levels and rounds
// 8. Tests (100% coverage)
// 9. Add visuilization of some kind

