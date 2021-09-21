package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void menuJeu(){
        System.out.println("             DestroyChesss      ");
        System.out.println();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~ ");

        System.out.println("1. Démarrer une partie ");
        System.out.println("2. Voir les scores");
        System.out.println("3. Les règles");
        System.out.println("4. Quitter le jeu");
        System.out.println();
        System.out.println("Choisir une entrée");
        int entree = 0;
        while (entree <= 0 || entree >4) {
            Scanner reader = new Scanner(System.in);
            entree = reader.nextInt();
            switch (entree) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    RegleDuJeu.main();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("L'entree est incorrect");
                    break;
            }
        }


    }

    public static void main(String[] args) {



        int entree = 0;
        boolean retourMenu = false;

        do {
            menuJeu();

        }while (retourMenu != true);








    }

}
