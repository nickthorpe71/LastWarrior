package com.los.lastwarrior;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinesService {
    public static List<Discipline> allDisciplines = new ArrayList<>();

    public DisciplinesService(){
        populateDisciplines();
    }

    public static List<Discipline> getAllDisciplines() {
        return allDisciplines;
    }

    public static void populateDisciplines(){
        BufferedReader br = null;

        try {
            br = new BufferedReader(new java.io.FileReader("src/discipline_data_full.txt"));

            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                if(line.trim().length() > 0) {
                    Discipline currentDiscipline = new Discipline();

                    String[] tokens = line.split("\\|");

                    currentDiscipline.setDiscipline(tokens[0]);
                    currentDiscipline.setImagePath(tokens[1]);
                    currentDiscipline.setHistory(tokens[2]);
                    currentDiscipline.setHp(Integer.parseInt(tokens[3]));
                    currentDiscipline.setEndurance(Integer.parseInt(tokens[4]));
                    currentDiscipline.setSpeed(Integer.parseInt(tokens[5]));
                    currentDiscipline.setPower(Integer.parseInt(tokens[6]));
                    currentDiscipline.setDefense(Integer.parseInt(tokens[7]));
                    currentDiscipline.setEvasion(Integer.parseInt(tokens[8]));
                    currentDiscipline.setAccuracy(Integer.parseInt(tokens[9]));

                    allDisciplines.add(currentDiscipline);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
