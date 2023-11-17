package com.epam.mjc.io;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileReader {

    public Profile getDataFromFile(File file) {

        String name = null;
        int age = 4;
        String email = null;


        StringBuilder profileData = new StringBuilder();
        try (FileInputStream stream = new FileInputStream(file)) {
            int i;
            while ((i = stream.read()) != -1) {
                profileData.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

            String string = profileData.toString();
            String[] splitStrings = string.split(": ");
            name = splitStrings[1];
            age = Integer.parseInt(splitStrings[2].replaceAll("[^0-9,]", ""));
            String[] hehe = name.split("[^\\w']+");
            String[] hehe1 = hehe[0].split("Age");
            String hehegirl = hehe1[0];


            Profile profile = new Profile(
                    hehegirl,
                    age,
                    hehegirl,
                    (long) age
            );
            return profile;

        }
    }

