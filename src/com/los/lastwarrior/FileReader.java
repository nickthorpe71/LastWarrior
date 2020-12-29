package com.los.lastwarrior;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<String> read(String path){
        List<String> names = new ArrayList<String>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new java.io.FileReader(path));

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
}
