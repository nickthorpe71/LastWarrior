package com.los.lastwarrior.warrior;

import com.los.lastwarrior.tournament.Round;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior warrior;

    @BeforeEach
    void setUpWarrior() {warrior = new Warrior();}

    @Test
    void testToString() {
        // Assemble // Act
        String warriorToString = warrior.toString();

        // Assert
        assertTrue(warriorToString.contains("Name: " + warrior.getFirstName() + " " + warrior.getLastName()));
        assertTrue(warriorToString.contains("Age: "  + warrior.getAge() + " years old"));
        assertTrue(warriorToString.contains("Height: " + warrior.getHeight() + "cm"));
        assertTrue(warriorToString.contains("Weight: " + warrior.getWeight() + "lbs"));
        assertTrue(warriorToString.contains("Discipline: " + warrior.getDiscipline().getDiscipline()));
        assertTrue(warriorToString.contains("History: " + warrior.getDiscipline().getHistory()));
        assertTrue(warriorToString.contains("Weapon(s): " + warrior.getWeapons()));
        assertTrue(warriorToString.contains("Hp: " + warrior.getHp()));
        assertTrue(warriorToString.contains("Endurance: " + warrior.getEndurance()));
        assertTrue(warriorToString.contains("Speed: " + warrior.getSpeed()));
        assertTrue(warriorToString.contains("Power: " + warrior.getPower()));
        assertTrue(warriorToString.contains("Defense: " + warrior.getDefense()));
        assertTrue(warriorToString.contains("Evasion: " + warrior.getEvasion()));
        assertTrue(warriorToString.contains("Accuracy: " + warrior.getAccuracy()));
    }

    @Test
    void getFirstName() {
        // Assemble
        String expected = "";

        // Act
        String result = warrior.getFirstName();

        // Assert
        assertEquals(expected.getClass().getName(), result.getClass().getName());
    }

    @Test
    void setFirstName() {
        // Assemble
        String input = "TestName";
        String expected = "TestName";

        // Act
        warrior.setFirstName(input);

        // Assert
        assertEquals(expected, warrior.getFirstName());
    }

    @Test
    void getLastName() {
        // Assemble
        String expected = "";

        // Act
        String result = warrior.getLastName();

        // Assert
        assertEquals(expected.getClass().getName(), result.getClass().getName());
    }

    @Test
    void setLastName() {
        // Assemble
        String input = "TestName";
        String expected = "TestName";

        // Act
        warrior.setLastName(input);

        // Assert
        assertEquals(expected, warrior.getLastName());
    }

    @Test
    void getAge() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getAge();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setAge() {
        // Assemble
        int input = 32;
        int expected = 32;

        // Act
        warrior.setAge(input);

        // Assert
        assertEquals(expected, warrior.getAge());
    }

    @Test
    void getHeight() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getHeight();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setHeight() {
        // Assemble
        int input = 182;
        int expected = 182;

        // Act
        warrior.setHeight(input);

        // Assert
        assertEquals(expected, warrior.getHeight());
    }

    @Test
    void getWeight() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getWeight();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setWeight() {
        // Assemble
        int input = 182;
        int expected = 182;

        // Act
        warrior.setWeight(input);

        // Assert
        assertEquals(expected, warrior.getWeight());
    }

    @Test
    void getWins() {
        // Assemble
        Warrior warrior2 = new Warrior();
        Round round = new Round(warrior, warrior2);
        UUID expected = round.getId();
        warrior.addWin(round);

        // Act
        List<Round> result = warrior.getWins();

        // Assert
        assertEquals(expected, result.get(0).getId());
    }

    @Test
    void setWins() {
        // Assemble
        Warrior warrior2 = new Warrior();
        Round round = new Round(warrior, warrior2);
        List<Round> testList = new ArrayList <>();
        testList.add(round);

        List<Round> input = testList;
        UUID expected = round.getId();

        // Act
        warrior.setWins(input);

        // Assert
        assertEquals(expected, warrior.getWins().get(0).getId());
    }

    @Test
    void addWin() {
        // Assemble
        Warrior warrior2 = new Warrior();
        Round round = new Round(warrior, warrior2);
        UUID expected = round.getId();

        // Act
        warrior.addWin(round);

        // Assert
        assertEquals(expected, warrior.getWins().get(0).getId());

    }

    @Test
    void isAlive() {
        // Assemble
        boolean expected = true;

        // Act
        boolean result = warrior.isAlive();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setAlive() {
        // Assemble
        boolean input = false;
        boolean expected = false;

        // Act
        warrior.setAlive(input);

        // Assert
        assertEquals(expected, warrior.isAlive());
    }

    @Test
    void getDiscipline() {
        // Assemble
        Discipline expected = new Discipline();

        // Act
        Discipline result = warrior.getDiscipline();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setDiscipline() {
        // Assemble
        Discipline input = new Discipline("Knight", "/images/knight.png", "Knights are one of the most feared and best-protected warriors on the battlefield.", 15,-10,-10,30,45,-10,0);
        Discipline expected = input;

        // Act
        warrior.setDiscipline(input);

        // Assert
        assertEquals(expected, warrior.getDiscipline());
    }

    @Test
    void getWeapons() {
        // Assemble
        String expected = "";

        // Act
        String result = warrior.getWeapons();

        // Assert
        assertEquals(expected.getClass().getName(), result.getClass().getName());
    }

    @Test
    void setWeapons() {
        // Assemble
        String input = "Sword";
        String expected = "Sword";

        // Act
        warrior.setWeapons(input);

        // Assert
        assertEquals(expected, warrior.getWeapons());
    }

    @Test
    void getHp() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getHp();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setHp() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setHp(input);

        // Assert
        assertEquals(expected, warrior.getHp());
    }

    @Test
    void getEndurance() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getEndurance();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setEndurance() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setEndurance(input);

        // Assert
        assertEquals(expected, warrior.getEndurance());
    }

    @Test
    void getSpeed() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getSpeed();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setSpeed() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setSpeed(input);

        // Assert
        assertEquals(expected, warrior.getSpeed());
    }

    @Test
    void getPower() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getPower();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setPower() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setPower(input);

        // Assert
        assertEquals(expected, warrior.getPower());
    }

    @Test
    void getDefense() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getDefense();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setDefense() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setDefense(input);

        // Assert
        assertEquals(expected, warrior.getDefense());
    }

    @Test
    void getEvasion() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getEvasion();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setEvasion() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setEvasion(input);

        // Assert
        assertEquals(expected, warrior.getEvasion());
    }

    @Test
    void getAccuracy() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getAccuracy();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setAccuracy() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setAccuracy(input);

        // Assert
        assertEquals(expected, warrior.getAccuracy());
    }

    @Test
    void getSwingRate() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getSwingRate();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setSwingRate() {
        // Assemble
        int input = 0;
        int expected = 0;

        // Act
        warrior.setSwingRate(input);

        // Assert
        assertEquals(expected, warrior.getSwingRate());
    }

    @Test
    void getHitChance() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getHitChance();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setHitChance() {
        // Assemble
        int input = 100;
        int expected = 100;

        // Act
        warrior.setHitChance(input);

        // Assert
        assertEquals(expected, warrior.getHitChance());
    }

    @Test
    void getBaseDamage() {
        // Assemble
        int expected = 1;

        // Act
        int result = warrior.getBaseDamage();

        // Assert
        assertEquals(((Object) expected).getClass().getName(), ((Object) result).getClass().getName());
    }

    @Test
    void setBaseDamage() {
        // Assemble
        int input = 10;
        int expected = 10;

        // Act
        warrior.setBaseDamage(input);

        // Assert
        assertEquals(expected, warrior.getBaseDamage());
    }
}