package com.los.lastwarrior;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameGen {
    public List<String> readFile(String path){
        List<String> names = new ArrayList<String>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));

            String line = br.readLine();

            while((line = br.readLine()) != null) {
                if(line.trim().length() > 0) {
                    names.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        return names;
    }

    public String generateName() {
        List<String> names = readFile("src/name_data.txt");

        Random rand = new Random();
        int randomFirst = rand.nextInt(names.size());
        int randomSecond = rand.nextInt(names.size());

        return names.get(randomFirst) + " " + names.get(randomSecond);
    }

}
