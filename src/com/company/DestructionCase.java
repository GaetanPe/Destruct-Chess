package com.company;

import java.util.Scanner;

import com.company.Main;

public class DestructionCase {

     static int verifCaseX(){

        return detruitCaseX;
    }
    static int verifCaseY(){

        return detruitCaseY;
    }

    public static void main() {
        Scanner destructX = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée x de la case à détruire.");
        int destructCaseX = destructX.nextInt();
        Scanner destructY = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée y de la case à détruire.");
        int destructCaseY = destructY.nextInt();

      while(Main.grille[destructCaseX][destructCaseY] == Main.grille[pion1x][pion1y] || Main.grille[destructCaseX][destructCaseY] == Main.grille[pion2x][pion2y]){
            destructCaseX =verifCaseX();
            destructCaseY = verifCaseY();
        }

        while(destructCaseX > 10 || destructCaseX < 0 || destructCaseY > 9 || destructCaseY < 0 ) {
            destructCaseX =verifCaseX();
            verifCaseY();
        }

        while(Main.grille[destructCaseX][destructCaseY] == "[x]"){
            destructCaseX =verifCaseX();
            verifCaseY();
        }

        Main.grille[destructCaseX][destructCaseY] = "[x]";
    }
}
