package com.los.lastwarrior;

import java.util.List;
import java.util.Random;

public class Warrior {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;

    Discipline discipline;
    String weapons;
    int hp = 350;
    int endurance = 100;
    int speed = 100;
    int power = 100;
    int defense = 100;
    int evasion = 100;
    int accuracy = 100;

    public Warrior() {
        Random rand = new Random();
        DisciplinesService disciplinesService = new DisciplinesService();

        List<String> allNames = FileReader.read("src/name_data.txt");
        List<Discipline> allDisciplines = disciplinesService.getAllDisciplines();
        List<String> allWeapons = FileReader.read("src/weapon_data.txt");

        firstName = allNames.get(rand.nextInt(allNames.size()));
        lastName = allNames.get(rand.nextInt(allNames.size()));
        age = rand.nextInt(100 + 1 - 12) + 12; //years
        height = rand.nextInt(220 + 1 - 120) + 120 - ((age < 20 || age > 70) ? 40 : 0); //cm
        weight = rand.nextInt((height * 2) + 1 - 120) + 120 - ((age < 22 || age > 70) ? 50 : 0); //lbs

        discipline = allDisciplines.get(rand.nextInt(allDisciplines.size()));
        weapons = allWeapons.get(rand.nextInt(allWeapons.size()));

        hp += (height - 100) + (weight - 100) - ((age > 50) ? age / 2 : 0) + rand.nextInt(50) + discipline.getHp();
        endurance += (height/2) - (weight/4) - ((age > 50) ? age / 2 : 0) + rand.nextInt(100) + discipline.getEndurance();
        speed += (height/2) - (weight/4) - ((age > 50) ? age / 2 : 0) + rand.nextInt(100) + discipline.getSpeed();
        power += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50) + speed + discipline.getPower();
        defense += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50) + discipline.getDefense();
        evasion += speed - (weight / 4) + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0) + discipline.getEvasion();
        accuracy += speed + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0) + discipline.getAccuracy();
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
}
