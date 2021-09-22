package com.company;
import java.lang.*;
import java.sql.SQLOutput;
import java.util.*;
import com.company.Main;
public class Joueur {
    public static void main() {

        //le choix du pseudo: On demande le nom des deux joueurs et on les rentre dans leur variables respectives
        // (pseudo1 pour le joueur 1 et pseudo2 pour le joueur 2)


        System.out.println("Quel est le nom du Joueur 1?");
        String pseudo1 = Main.sc.next();
        System.out.println("Quel est le nom du Joueur 2?");
        String pseudo2 = Main.sc.next();

        //On vérifie que les joueurs aient deux pseudos distinct entre 2 et 10 caractères.
        while(pseudo2.equals(pseudo1) ||(pseudo2.length() > 10) || (pseudo2.length() < 2)){
            System.out.println("Pseudo du joueur 2 similaire au joueur 1 ou trop long. Choisissez un autre pseudo.");
            pseudo2 = Main.sc.next();
        }
        while(pseudo1.length() > 10 || pseudo1.length() < 2){
            System.out.println("Pseudo du joueur 1 trop long. Choisissez un autre pseudo.");
            pseudo1 = Main.sc.next();
        }

        // Joueur qui commence
        boolean joueur = true;
        double nombre;
        nombre = Math.random();
        nombre = nombre * 2;
        int premier = (int) nombre;
        if(premier == 0){
            String pseudoJouer1 = pseudo1;
            joueur = true;
        }
        else if(premier == 1){
            String pseudoJouer2 = pseudo2;
            joueur = false;
        }
        // Création des pions 1 et 2 en fonction de leurs coordonnées x et y.

        int pion1x = new Random().nextInt(10);
        int pion1y = new Random().nextInt(11);
        int pion2x = new Random().nextInt(10);
        int pion2y = new Random().nextInt(11);

        // Utilisation d'une boucle for pour remplir la grille de cases. t étant la coordonnée x et i étant la coordonnée y.
        int i;
        for(int t = 0; t < 10; ++t) {
            for(i = 0; i < 11; ++i) {
                Main.grille[t][i] = "[ ]";
            }
        }

        // Ajout des pions 1 et 2 sur le plateau de jeu grâce à leurs coordonnées.
        Main.grille [pion1x][pion1y] = "[1]";
        Main.grille [pion2x][pion2y] = "[2]";

        // Afficher le tableau dans la console.
        // (k et l servant a naviguer verticalement et horizontalement dans le tableau.)

        for(int k = 0; k < 10; k++) {
            String ligne = "";
            for (int l = 0; l < 11; l++) {
                ligne += Main.grille[k][l];
            }
            System.out.println(ligne);
        }

        //On demande au joueur la direction dans laquelle il souhaite aller
        // puis on la stocke dans la variable direction.


        System.out.println("Dans quel direction voulez-vous aller ? ( H / B / G / D )");
        String direction = Main.sc.next();
        //On vérifie que la réponse est bien une direction sinon on redemande au joueur la direction.

        while(!direction.equals("H") && !direction.equals("G") &&  !direction.equals("D") && !direction.equals("B")){
            System.out.println("Veuillez choisir une direction (haut / bas / gauche / droite)");
            direction = Main.sc.next();
        }

        //On utilise un switch pour avancer le pion dans la direction souhaitée
        // en prenant en compte quel joueur est actuellement en train de jouer.

        switch(direction) {
            case "H":
                if (joueur == true) {
                    pion1x--;
                    System.out.println(pion1x);

                } else {
                    pion2x--;
                }
                break;
            case "G":
                if (joueur == true) {
                    pion1y--;
                } else {
                    pion2y--;
                }
                break;
            case "D":
                if (joueur == true) {
                    pion1y++;
                } else {
                    pion2y++;
                }
                break;
            case "B":
                if (joueur == true) {
                    pion1x++;
                } else {
                    pion2x++;
                }
                break;
        }
        System.out.flush();

    }
}
