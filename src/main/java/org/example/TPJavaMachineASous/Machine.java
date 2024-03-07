package org.example.TPJavaMachineASous;

import java.util.Random;
import java.util.Scanner;
import com.google.gson.Gson;

public class Machine {
    private String[][] matrix;
    private int coins;
    private String[][] columns;
    private int partieJoue;
    private int partieGagne;
    private int jetonsUtilise;

    public Machine(ColumnsHandler columnsHandler, int initialCoins) {
        this.columns = columnsHandler.getColumns();
        this.matrix = initializeMatrix(columns);
        this.coins = initialCoins;
        this.partieJoue = 0;
        this.partieGagne = 0;
        this.jetonsUtilise = 0;
    }

    private String[][] initializeMatrix(String[][] columns) {
        Random random = new Random();
        String[][] matrix = new String[3][3];

        matrix[0][0] = columns[0][random.nextInt(columns[0].length)];
        matrix[1][1] = columns[1][random.nextInt(columns[1].length)];
        matrix[2][2] = columns[2][random.nextInt(columns[2].length)];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[j][i] == null) {
                    int randomPosition = random.nextInt(columns[i].length);
                    matrix[j][i] = columns[i][randomPosition];
                }
            }
        }
        return matrix;
    }

    void afficheMachine() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matrix[j][i] + ") | ");
            }
            System.out.println();
        }
    }

    int Symbole(String winValue) {
        String[][] symboleValues = {
                {"300", "7"},
                {"100", "BAR"},
                {"15", "R"},
                {"15", "P"},
                {"15", "T"},
                {"8", "C"}
        };

        for (int i = 0; i < symboleValues.length; i++) {
            if (symboleValues[i][1].equals(String.valueOf(winValue))) {
                //System.out.println("La valeur est: " + symboleValues[i][0] + " la lettre est: "+ symboleValues[i][1]);
                return Integer.parseInt(symboleValues[i][0]);
            }
        }

        return 0;
    }

    private void tourneMachine() {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int randomPosition = random.nextInt(matrix[i].length);

            for (int j = 0; j < 3; j++) {
                matrix[j][i] = columns[i][(randomPosition + j) % columns[i].length];
            }
        }
    }

    int checkWin() {

        int winnings = 0;

        for (int i = 0; i < 3; i++) {

            if (matrix[0][i].equals(matrix[1][i]) && matrix[1][i].equals(matrix[2][i])) {
                Symbole(String.valueOf(matrix[0][i]));
                winnings += Symbole(String.valueOf(matrix[0][i]));
            }
        }

        if (matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2])) {
            Symbole(String.valueOf(matrix[0][0]));
            winnings += Symbole(String.valueOf(matrix[0][0]));
        }

        if (matrix[0][2].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][0])) {
            Symbole(String.valueOf(matrix[0][2]));
            winnings += Symbole(String.valueOf(matrix[0][2]));
        }
        return winnings;
    }

    private void saveStatisticsToJson() {
        Gson gson = new Gson();
        String statisticsJson = gson.toJson(getStatistics());
        System.out.println("Statistiques enregistrées : \n" + statisticsJson);
    }

    private Statistics getStatistics() {
        return new Statistics(coins, partieJoue, partieGagne, jetonsUtilise);
    }

    public int getCoins() {
        return coins;
    }

    private static class Statistics {
        private int jetons;
        private int partieJoue;
        private int partieGagne;
        private int jetonsPerdu;

        public Statistics(int jetons, int partieJoue, int partieGagne, int jetonsPerdu) {
            this.jetons = jetons;
            this.partieJoue = partieJoue;
            this.partieGagne = partieGagne;
            this.jetonsPerdu = jetonsPerdu;
        }
    }

    public void joue(int mise) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            tourneMachine();

            afficheMachine();

            int winnings = checkWin();

            coins += winnings - mise;

            partieJoue++;
            if (winnings > 0) {
                partieGagne++;
                System.out.println("Bravo vous avez gagné des jetons ! ");
            }
            jetonsUtilise += mise;

            System.out.println("Gains : " + winnings);
            System.out.println("Jetons possédés : " + coins);

            System.out.print("Voulez-vous jouer encore ? (oui/non) : ");
            String playAgain = scanner.nextLine().toLowerCase();
            System.out.print("\n");
            System.out.println("-----------------------------------");

            if (!playAgain.equals("oui")) {
                saveStatisticsToJson();
                break;
            }
        }
    }
}

