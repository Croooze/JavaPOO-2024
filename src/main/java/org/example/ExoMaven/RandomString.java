package org.example.ExoMaven;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomString {
    public static String generateRandomAlphabeticString(int mdp) {
        return RandomStringUtils.randomAlphabetic(mdp);}

    public static void reverse(){
        String str = "";

        StringBuilder sb = new StringBuilder();

        sb.append(str);

        sb = sb.reverse();

        System.out.println(sb);
    }
}
