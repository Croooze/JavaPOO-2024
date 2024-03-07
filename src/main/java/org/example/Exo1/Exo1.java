package org.example.Exo1;

public class Exo1 {
    public static void pyramide() {
        int rows = 6;
        System.out.println("\n1. Pyramide\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
    }
}




