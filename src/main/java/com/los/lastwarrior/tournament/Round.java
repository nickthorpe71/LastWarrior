package com.los.lastwarrior.tournament;

import com.los.lastwarrior.warrior.Warrior;

import java.util.*;

public class Round {
    private Date roundDate = new Date();
    private UUID id = UUID.randomUUID();
    private int roundTime; // seconds
    private Warrior warrior1;
    private Warrior warrior2;

    private int w1SwingCount = 0;
    private int w2SwingCount = 0;
    private int w1MissCount = 0;
    private int w2MissCount = 0;
    private int w1TotalDamage = 0;
    private int w2TotalDamage = 0;

    private Warrior winner;
    private Warrior loser;

    private List<String> battleLog = new ArrayList<>();

    public Round(Warrior warrior1, Warrior warrior2) {
        this.warrior1 = warrior1;
        this.warrior2 = warrior2;
    }

    public void execute(){
        Random rand = new Random();

        float w1Hit = ((float)warrior1.getAccuracy() / (float)warrior2.getEvasion()) * 50;
        float w2Hit = ((float)warrior2.getAccuracy() / (float)warrior1.getEvasion()) * 50;

        warrior1.setHitChance((int)w1Hit);
        warrior2.setHitChance((int)w2Hit);

        float w1Dmg = ((float)warrior1.getPower() / (float)warrior2.getDefense()) * 25;
        float w2Dmg = ((float)warrior2.getPower() / (float)warrior1.getDefense()) * 25;

        warrior1.setBaseDamage((int)w1Dmg);
        warrior2.setBaseDamage((int)w2Dmg);

        while(warrior1.getHp() > 0 && warrior2.getHp() > 0){
            // warrior 1 swings
            if(roundTime % warrior1.getSwingRate() == 0){
                int luck = rand.nextInt(5);
                boolean hit = rand.nextInt(100) <= (warrior1.getHitChance() + luck);

                w1SwingCount++;

                if(hit){
                    warrior2.setHp(warrior2.getHp() - (warrior1.getBaseDamage() + luck));
                    w1TotalDamage += warrior1.getBaseDamage() + luck;

                    battleLog.add("Time: " + roundTime + " - " + warrior1.getFirstName() + " hit for " + (warrior1.getBaseDamage() + luck) + " dmg");
                    battleLog.add("Time: " + roundTime + " - " + warrior2.getFirstName() + " has " + warrior2.getHp() + " hp remaining");
                } else {
                    w1MissCount++;
                    battleLog.add("Time: " + roundTime + " - " + warrior1.getFirstName() + " missed");
                }

            }

            // warrior 2 swings
            if(roundTime % warrior2.getSwingRate() == 0){
                int luck = rand.nextInt(5);
                boolean hit = rand.nextInt(100) <= (warrior2.getHitChance() + luck);

                w2SwingCount++;

                if(hit){
                    warrior1.setHp(warrior1.getHp() - (warrior2.getBaseDamage() + luck));
                    w2TotalDamage += warrior2.getBaseDamage() + luck;

                    battleLog.add("Time: " + roundTime + " - " + warrior2.getFirstName() + " hit for " + (warrior2.getBaseDamage() + luck) + " dmg");
                    battleLog.add("Time: " + roundTime + " - " + warrior1.getFirstName() + " has " + warrior1.getHp() + " hp remaining");
                } else {
                    w2MissCount++;
                    battleLog.add("Time: " + roundTime + " - " + warrior2.getFirstName() + " missed");
                }

            }

            roundTime++;
        }

        if(warrior2.getHp() <= 0){
            warrior1.addWin(this);
            warrior2.setAlive(false);
            winner = warrior1;
            loser = warrior2;
        } else {
            warrior2.addWin(this);
            warrior1.setAlive(false);
            winner = warrior2;
            loser = warrior1;
        }
    }

    public int getRoundTime(){
        return this.roundTime;
    }

    public Warrior getLoser(){
        return this.loser;
    }

    public Warrior getWinner(){
        return this.winner;
    }

    public List<String> getBattleLog() {
        return battleLog;
    }

    public int getW1SwingCount() {
        return w1SwingCount;
    }

    public int getW2SwingCount() {
        return w2SwingCount;
    }

    public int getW1MissCount() {
        return w1MissCount;
    }

    public int getW2MissCount() {
        return w2MissCount;
    }

    public int getW1TotalDamage() {
        return w1TotalDamage;
    }

    public int getW2TotalDamage() {
        return w2TotalDamage;
    }

    public UUID getId(){
        return id;
    }
}
