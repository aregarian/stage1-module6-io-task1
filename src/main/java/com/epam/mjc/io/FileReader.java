package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
            StringBuilder profileData = new StringBuilder();
            try {
                FileInputStream stream = new FileInputStream(file);
                int i;
                while ((i = stream.read()) != -1) {
                    profileData.append((char) i);
                }
                stream.close();
            } catch (IOException e) {

            }

            String string = profileData.toString();
            String[] splitStrings = string.split(": ");
            String[] profileFields = new String[4];

            for (int i = 0; i < splitStrings.length; i++) {
                if (splitStrings[i])
                    profileFields[i] = splitStrings[i];

            }

            Profile profile = new Profile(
                    profileFields[0],
                    Integer.parseInt(profileFields[1]),
                    profileFields[2],
                    Long.parseLong(profileFields[3])
            );
            return profile;

    }
}
