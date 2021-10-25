package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GetName {

    private BufferedReader in;
    public String[] names;

    public GetName() {

        try {
            Path thePath = Paths.get("src/" + "namelist.txt");

            in = new BufferedReader(new FileReader(String.valueOf(thePath)));

            List<String> lines = new ArrayList<>();

            String line = null;

            try{
                line = in.readLine();

                while(line != null){
                    lines.add(line);
                    line = in.readLine();
                }

                in.close();

                names = lines.toArray(new String[lines.size()]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
