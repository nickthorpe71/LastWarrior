package com.los.lastwarrior.warrior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinesServiceTest {
    DisciplinesService disciplinesService = new DisciplinesService();

    @BeforeEach
    void setUpDiscipline() {disciplinesService = new DisciplinesService();}

    @Test
    void getAllDisciplines() {
        // Assemble
        Discipline expected = new Discipline("Knight", "/images/knight.png", "Knights are one of the most feared and best-protected warriors on the battlefield.", 15,-10,-10,30,45,-10,0);
        // Act
        Discipline result = disciplinesService.getAllDisciplines().get(0);

        // Assert
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    void populateDisciplines() {
        // Assemble
        Discipline expected = new Discipline("Knight", "/images/knight.png", "Knights are one of the most feared and best-protected warriors on the battlefield.", 15,-10,-10,30,45,-10,0);
        // Act
        Discipline result = disciplinesService.getAllDisciplines().get(0);

        // Assert
        assertEquals(expected.toString(), result.toString());
    }
}