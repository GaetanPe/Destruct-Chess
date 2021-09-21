package com.company;

public class tableau {

    public static void main() {
        int pion1x = 5;
        int pion1y = 4;
        int pion2x = 5;
        int pion2y = 5;
        String[][] grille = new String[12][11];

        int i;
        for (int t = 0; t < 10; ++t) {
            for (i = 0; i < 11; ++i) {
                grille[t][i] = "[ ]";
            }
        }
        grille[pion1x][pion1y] = "[1]";
        grille[pion2x][pion2y] = "[2]";
        System.out.println(grille[0][0] + grille[0][1] + grille[0][2] + grille[0][3] + grille[0][4] + grille[0][5] + grille[0][6] + grille[0][7] + grille[0][8] + grille[0][9] + grille[0][10]);
        System.out.println(grille[1][0] + grille[1][1] + grille[1][2] + grille[1][3] + grille[1][4] + grille[1][5] + grille[1][6] + grille[1][7] + grille[1][8] + grille[1][9] + grille[1][10]);
        System.out.println(grille[2][0] + grille[2][1] + grille[2][2] + grille[2][3] + grille[2][4] + grille[2][5] + grille[2][6] + grille[2][7] + grille[2][8] + grille[2][9] + grille[2][10]);
        System.out.println(grille[3][0] + grille[3][1] + grille[3][2] + grille[3][3] + grille[3][4] + grille[3][5] + grille[3][6] + grille[3][7] + grille[3][8] + grille[3][9] + grille[3][10]);
        System.out.println(grille[4][0] + grille[4][1] + grille[4][2] + grille[4][3] + grille[4][4] + grille[4][5] + grille[4][6] + grille[4][7] + grille[4][8] + grille[4][9] + grille[4][10]);
        System.out.println(grille[5][0] + grille[5][1] + grille[5][2] + grille[5][3] + grille[5][4] + grille[5][5] + grille[5][6] + grille[5][7] + grille[5][8] + grille[5][9] + grille[5][10]);
        System.out.println(grille[6][0] + grille[6][1] + grille[6][2] + grille[6][3] + grille[6][4] + grille[6][5] + grille[6][6] + grille[6][7] + grille[6][8] + grille[6][9] + grille[6][10]);
        System.out.println(grille[7][0] + grille[7][1] + grille[7][2] + grille[7][3] + grille[7][4] + grille[7][5] + grille[7][6] + grille[7][7] + grille[7][8] + grille[7][9] + grille[7][10]);
        System.out.println(grille[8][0] + grille[8][1] + grille[8][2] + grille[8][3] + grille[8][4] + grille[8][5] + grille[8][6] + grille[8][7] + grille[8][8] + grille[8][9] + grille[8][10]);
        System.out.println(grille[9][0] + grille[9][1] + grille[9][2] + grille[9][3] + grille[9][4] + grille[9][5] + grille[9][6] + grille[9][7] + grille[9][8] + grille[9][9] + grille[9][10]);

    }
}