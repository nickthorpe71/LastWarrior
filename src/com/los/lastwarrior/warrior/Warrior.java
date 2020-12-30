package com.los.lastwarrior.warrior;

import com.los.lastwarrior.FileReader;
import com.los.lastwarrior.tournament.Round;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Warrior {
    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private int weight;
    private List<Round> wins = new ArrayList<>();
    private boolean alive;

    private Discipline discipline;
    private String weapons;
    private int hp = 350;
    private int endurance = 100;
    private int speed = 100;
    private int power = 100;
    private int defense = 100;
    private int evasion = 100;
    private int accuracy = 100;
    private int hitChance = 0;
    private int swingRate = 0; // set during round
    private int baseDamage = 0; // set during round

    public Warrior() {
        Random rand = new Random();
        DisciplinesService disciplinesService = new DisciplinesService();

        List<String> allNames = FileReader.read("src/name_data.txt");
        List<Discipline> allDisciplines = disciplinesService.getAllDisciplines();
        List<String> allWeapons = FileReader.read("src/weapon_data.txt");

        firstName = allNames.get(rand.nextInt(allNames.size()));
        lastName = allNames.get(rand.nextInt(allNames.size()));
        age = rand.nextInt(100 + 1 - 12) + 12; //years
        height = rand.nextInt(220 + 1 - 140) + 140 - ((age < 16 || age > 70) ? rand.nextInt(40) : 0); //cm
        weight = rand.nextInt((height * 2) + 1 - 120) + 120 - ((age < 22 || age > 70) ? rand.nextInt(50) : 0); //lbs

        alive = true;

        discipline = allDisciplines.get(rand.nextInt(allDisciplines.size()));
        weapons = allWeapons.get(rand.nextInt(allWeapons.size()));

        hp += (height - 100) + (weight - 100) - ((age > 50) ? age / 2 : 0) + rand.nextInt(50) + discipline.getHp();
        endurance += (- (Math.abs(weight - height) / 2) - ((age > 50) ? age / 4 : 0) + rand.nextInt(150) + (discipline.getEndurance()));
        speed += (height/2) - (weight/2) - ((age > 50) ? age / 2 : 0) + rand.nextInt(100) + discipline.getSpeed();
        power += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50) + speed + discipline.getPower();
        defense += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50) + discipline.getDefense();
        evasion += speed - (weight / 4) + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0) + discipline.getEvasion();
        accuracy += speed + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0) + discipline.getAccuracy();
        swingRate = (25 - Math.round(endurance / 15)) - speed / 75;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + " years old" + "\n" +
                "Height: " + height + "cm" + "\n" +
                "Weight: " + weight + "lbs" + "\n" +
                "Discipline: " + discipline.getDiscipline() + "\n" +
                "History: " + discipline.getHistory() + "\n" +
                "Weapon(s): " + weapons + "\n" +
                "Hp: " + hp + "\n" +
                "Endurance: " + endurance + "\n" +
                "Speed: " + speed + "\n" +
                "Power: " + power + "\n" +
                "Defense: " + defense + "\n" +
                "Evasion: " + evasion + "\n" +
                "Accuracy: " + accuracy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Round> getWins() {
        return wins;
    }

    public void setWins(List<Round> wins) {
        this.wins = wins;
    }

    public void addWin(Round win) {
        this.wins.add(win);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
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

    public int getSwingRate() {
        return swingRate;
    }

    public void setSwingRate(int swingRate) {
        this.swingRate = swingRate;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
