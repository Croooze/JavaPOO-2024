package org.example.ExoMaven;

import java.util.Scanner;

import static org.example.ExoMaven.RandomString.generateRandomAlphabeticString;

public class Main3 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("\nAppuyez sur Entrée pour générer une nouvelle chaîne aléatoire...");
        scanner.nextLine();

        int length = 10;
        String randomString = generateRandomAlphabeticString(length);
        System.out.println("Chaîne alphabétique aléatoire : " + randomString);
        }
    }
}

