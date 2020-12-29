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

//        for(int i = 0; i < round1.getBattleLog().size(); i++){
//            System.out.println(round1.getBattleLog().get(i));
//        }

        Warrior winner = round1.getWinner();
        Warrior loser = round1.getLoser();

        System.out.println("\nThe winner is " + winner.getFirstName() + " " + winner.getLastName() + " with " + winner.getHp() + " hp remaining!");
        System.out.println("The loser is " + loser.getFirstName() + " " + loser.getLastName() + " may they RIP\n");

        System.out.println(warrior1.getFirstName() + " Stats:");
        System.out.println(round1.getW1SwingCount() + " total swings");
        System.out.println(round1.getW1MissCount() + " misses");
        System.out.println((round1.getW1SwingCount() - round1.getW1MissCount()) + " connections");
        System.out.println(round1.getW1TotalDamage() + " total damage\n");

        System.out.println(warrior2.getFirstName() + " Stats:");
        System.out.println(round1.getW2SwingCount() + " total swings");
        System.out.println(round1.getW2MissCount() + " misses");
        System.out.println((round1.getW2SwingCount() - round1.getW2MissCount()) + " connections");
        System.out.println(round1.getW2TotalDamage() + " total damage");

    }
}

// todo:
// 1. name gen - complete
// 2. warrior base stats and class check python code for base
// 3. enemy base stats
// 4. simple battle (use blackjack/python code as an example)
// 5. write simple battle to text file

// FILE WRITING \\
//public void writeFile(String name) {
//    PrintWriter out = null;
//    try {
//        // 1. create the output stream
//        out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//
//        // 2. write the data to the output stream
//        out.printf("Name: %s\n", name);
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    } finally {
//        if(out != null) {
//            // 3. close the output stream
//            out.close();
//        }
//    }
//}
