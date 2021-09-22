package com.company;

import java.util.Scanner;

public class DestructCase {

    static int verifCaseX(){
        Scanner destructX = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée x de la case à détruire.");
        int detruitCaseX = destructX.nextInt();
        return detruitCaseX;
    }
    static int verifCaseY(){
        Scanner destructY = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée y de la case à détruire.");
        int detruitCaseY = destructY.nextInt();
        return detruitCaseY;
    }

    public static void main() {
        Scanner destructX = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée x de la case à détruire.");
        int destructCaseX = destructX.nextInt();
        Scanner destructY = new Scanner(System.in);
        System.out.println("Choisissez la coordonnée y de la case à détruire.");
        int destructCaseY = destructY.nextInt();

        while(grille[destructCaseX][destructCaseY] == grille[pion1x][pion1y] || grille[destructCaseX][destructCaseY] == grille[pion2x][pion2y]){
            verifCaseX();
            verifCaseY();
        }

        while(destructCaseX > 10 || destructCaseX < 0 || destructCaseY > 9 || destructCaseY < 0 ) {
            verifCaseX();
            verifCaseY();
        }

        while(grille[destructCaseX][destructCaseY] == "[x]"){
            verifCaseX();
            verifCaseY();
        }

        grille[destructCaseX][destructCaseY] == "[x]";
    }
}
