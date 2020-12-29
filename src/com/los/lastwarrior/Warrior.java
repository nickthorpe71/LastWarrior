package com.los.lastwarrior;

import java.util.List;
import java.util.Random;

public class Warrior {
    String firstName;
    String lastName;
    int age;
    int height;
    int weight;

    String dicipline;
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

        List<String> allNames = FileReader.read("src/name_data.txt");
        List<String> allDiciplines = FileReader.read("src/dicipline_data.txt");
        List<String> allWeapons = FileReader.read("src/weapon_data.txt");

        firstName = allNames.get(rand.nextInt(allNames.size()));
        lastName = allNames.get(rand.nextInt(allNames.size()));
        age = rand.nextInt(100 + 1 - 12) + 12; //years
        height = rand.nextInt(220 + 1 - 100) + 100 - ((age < 16 || age > 70) ? 50 : 0); //cm
        weight = rand.nextInt(400 + 1 - 100) + 100 - ((age < 16 || age > 70) ? 30 : 0); //lbs

        dicipline = allDiciplines.get(rand.nextInt(allDiciplines.size()));
        weapons = allWeapons.get(rand.nextInt(allWeapons.size()));

        hp += (height - 100) + (weight - 100) - ((age > 50) ? age / 2 : 0) + rand.nextInt(50);
        endurance += (height/2) - (weight/4) - ((age >50) ? age / 2 : 0) + rand.nextInt(100);
        speed += (height/2) - (weight/4) - ((age >50) ? age / 2 : 0) + rand.nextInt(100);
        power += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50) + speed;
        defense += (height - 100) + (weight/2) - ((age > 50) ? age / 10 : 0) + rand.nextInt(50);
        evasion += speed - (weight / 4) + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0);
        accuracy += speed + rand.nextInt(50) + ((age >30) ? age / (rand.nextInt(10) + 1) : 0);
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + " years old" + "\n" +
                "Height: " + height + "cm" + "\n" +
                "Weight: " + weight + "lbs" + "\n" +
                "-------------" + "\n" +
                "Dicipline: " + dicipline + "\n" +
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
