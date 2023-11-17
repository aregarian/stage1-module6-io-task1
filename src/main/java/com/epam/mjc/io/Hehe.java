package com.epam.mjc.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Hehe {

    public static void main(String[] args) {
        StringBuilder profileData = new StringBuilder();
        try {
            FileInputStream stream = new FileInputStream("src/main/resources/Profile.txt");
            int i;
            while ((i = stream.read()) != -1) {
                profileData.append((char) i);
            }
            stream.close();
        } catch (IOException e) {
            System.out.printf("asda");

        }

        String string = profileData.toString();
        String[] splitStrings = string.split(": ");


        for (int i = 0; i < splitStrings.length; i++) {
            System.out.println(splitStrings[i]);
        }
    }
}
