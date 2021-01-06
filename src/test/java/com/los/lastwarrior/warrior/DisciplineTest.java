package com.los.lastwarrior.warrior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplineTest {
    Discipline discipline;

    @BeforeEach
    void setUpDiscipline() {discipline = new Discipline();}

    @Test
    void getDiscipline() {
        // Assemble
        String input = "Samurai";
        String expected = "Samurai";
        discipline.setDiscipline(input);

        // Act
        String result = discipline.getDiscipline();

        // Assert
        assertEquals(expected, result, "Expected discipline to be Samurai when called with Samurai");
    }

    @Test
    void setDiscipline() {
        // Assemble
        String input = "Samurai";
        String expected = "Samurai";

        // Act
        discipline.setDiscipline(input);

        // Assert
        assertEquals(expected, discipline.getDiscipline(), "Expected discipline to be Samurai when called with Samurai");
    }

    @Test
    void getImagePath() {
        // Assemble
        String input = "/images/samurai.png";
        String expected = "/images/samurai.png";
        discipline.setImagePath(input);

        // Act
        String result = discipline.getImagePath();

        // Assert
        assertEquals(expected, result, "Expected image path to be /images/samurai.png when called with /images/samurai.png");
    }

    @Test
    void setImagePath() {
        // Assemble
        String input = "/images/samurai.png";
        String expected = "/images/samurai.png";

        // Act
        discipline.setDiscipline(input);

        // Assert
        assertEquals(expected, discipline.getDiscipline(), "Expected image path to be /images/samurai.png when called with /images/samurai.png");
    }

    @Test
    void getHistory() {
        // Assemble
        String input = "Trained from aged 10 or even earlier, Samurai are elite and highly-trained soldiers adept at using both the bow and sword.";
        String expected = "Trained from aged 10 or even earlier, Samurai are elite and highly-trained soldiers adept at using both the bow and sword.";
        discipline.setHistory(input);

        // Act
        String result = discipline.getHistory();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setHistory() {
        // Assemble
        String input = "Trained from aged 10 or even earlier, Samurai are elite and highly-trained soldiers adept at using both the bow and sword.";
        String expected = "Trained from aged 10 or even earlier, Samurai are elite and highly-trained soldiers adept at using both the bow and sword.";

        // Act
        discipline.setHistory(input);

        // Assert
        assertEquals(expected, discipline.getHistory());
    }

    @Test
    void getHp() {
        // Assemble
        int expected = 1;
        discipline.setHp(expected);

        // Act
        int result = discipline.getHp();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setHp() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setHp(expected);

        // Assert
        assertEquals(expected, discipline.getHp());
    }

    @Test
    void getEndurance() {
        // Assemble
        int expected = 1;
        discipline.setEndurance(expected);

        // Act
        int result = discipline.getEndurance();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setEndurance() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setEndurance(expected);

        // Assert
        assertEquals(expected, discipline.getEndurance());
    }

    @Test
    void getSpeed() {
        // Assemble
        int expected = 1;
        discipline.setSpeed(expected);

        // Act
        int result = discipline.getSpeed();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setSpeed() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setHp(expected);

        // Assert
        assertEquals(expected, discipline.getHp());
    }

    @Test
    void getPower() {
        // Assemble
        int expected = 1;
        discipline.setPower(expected);

        // Act
        int result = discipline.getPower();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setPower() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setPower(expected);

        // Assert
        assertEquals(expected, discipline.getPower());
    }

    @Test
    void getDefense() {
        // Assemble
        int expected = 1;
        discipline.setDefense(expected);

        // Act
        int result = discipline.getDefense();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setDefense() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setDefense(expected);

        // Assert
        assertEquals(expected, discipline.getDefense());
    }

    @Test
    void getEvasion() {
        // Assemble
        int expected = 1;
        discipline.setEvasion(expected);

        // Act
        int result = discipline.getEvasion();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setEvasion() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setEvasion(expected);

        // Assert
        assertEquals(expected, discipline.getEvasion());
    }

    @Test
    void getAccuracy() {
        // Assemble
        int expected = 1;
        discipline.setAccuracy(expected);

        // Act
        int result = discipline.getAccuracy();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void setAccuracy() {
        // Assemble
        int expected = 1;

        // Act
        discipline.setAccuracy(expected);

        // Assert
        assertEquals(expected, discipline.getAccuracy());
    }
}