package com.los.lastwarrior.warrior;

import java.util.List;

public class Discipline {
    private String discipline = "";
    private String imagePath = "";
    private String history = "";

    // Bonus Stats
    private int hp = 0;
    private int endurance = 0;
    private int speed = 0;
    private int power = 0;
    private int defense = 0;
    private int evasion = 0;
    private int accuracy = 0;

    public Discipline() {
    }

    public Discipline(String discipline, String imagePath, String history, int hp, int endurance, int speed, int power, int defense, int evasion, int accuracy) {
        this.discipline = discipline;
        this.imagePath = imagePath;
        this.history = history;
        this.hp = hp;
        this.endurance = endurance;
        this.speed = speed;
        this.power = power;
        this.defense = defense;
        this.evasion = evasion;
        this.accuracy = accuracy;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String dicipline) {
        this.discipline = dicipline;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "discipline='" + discipline + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", history='" + history + '\'' +
                ", hp=" + hp +
                ", endurance=" + endurance +
                ", speed=" + speed +
                ", power=" + power +
                ", defense=" + defense +
                ", evasion=" + evasion +
                ", accuracy=" + accuracy +
                '}';
    }
}