package com.company;
import java.lang.*;
import java.util.*;
public class Joueur {
    public static void main() {

        //le choix du pseudo: On demande le nom des deux joueurs et on les rentre dans leur variables respectives
        // (pseudo1 pour le joueur 1 et pseudo2 pour le joueur 2)

        Scanner joueur1 = new Scanner(System.in);
        System.out.println("Quel est le nom du Joueur 1?");
        String pseudo1 = joueur1.next();
        Scanner joueur2 = new Scanner(System.in);
        System.out.println("Quel est le nom du Joueur 2?");
        String pseudo2 = joueur2.next();

        //On vérifie que les joueurs aient deux pseudos distinct entre 2 et 10 caractères.
        while((pseudo1 == pseudo2) ||(pseudo2.length() > 10) || (pseudo2.length() < 2)){
            Scanner verif2 = new Scanner(System.in);
            System.out.println("Pseudo du joueur 2 similaire au joueur 1 ou trop long. Choisissez un autre pseudo.");
            pseudo2 = verif2.next();
        }
        while(pseudo1.length() > 10 || pseudo1.length() < 2){
            Scanner verif1 = new Scanner(System.in);
            System.out.println("Pseudo du joueur 1 trop long. Choisissez un autre pseudo.");
            pseudo1 = verif1.next();
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
        int pion1x = 4;
        int pion1y = 5;
        int pion2x = 5;
        int pion2y = 5;

        // Création du plateau de jeu avec grille un tableau en 2 dimensions de taille 11x10.
        String[][] grille = new String[10][11];

        // Utilisation d'une boucle for pour remplir la grille de cases. t étant la coordonnée x et i étant la coordonnée y.
        int i;
        for(int t = 0; t < 10; ++t) {
            for(i = 0; i < 11; ++i) {
                grille[t][i] = "[ ]";
            }
        }

        // Ajout des pions 1 et 2 sur le plateau de jeu grâce à leurs coordonnées.
        grille [pion1x][pion1y] = "[1]";
        grille [pion2x][pion2y] = "[2]";

        // Afficher le tableau dans la console.
        // (k et l servant a naviguer verticalement et horizontalement dans le tableau.)

        for(int k = 0; k < 10; k++) {
            String ligne = "";
            for (int l = 0; l < 11; l++) {
                ligne += grille[k][l];
            }
            System.out.println(ligne);
        }

        //On demande au joueur la direction dans laquelle il souhaite aller
        // puis on la stocke dans la variable direction.

        Scanner dir = new Scanner(System.in);
        System.out.println("Dans quel direction voulez-vous aller ? ( haut / bas / gauche / droite)");
        String direction = dir.next();

        //On vérifie que la réponse est bien une direction sinon on redemande au joueur la direction.

        while(direction != "haut" || direction != "gauche" ||  direction != "droite" || direction != "bas"){
            dir = new Scanner(System.in);
            System.out.println("Veuillez choisir une direction (haut / bas / gauche / droite)");
            direction = dir.next();
        }

        //On utilise un switch pour avancer le pion dans la direction souhaitée
        // en prenant en compte quel joueur est actuellement en train de jouer.

        switch(direction) {
            case "haut":
                if (joueur == true) {
                    pion1x--;
                } else {
                    pion2x--;
                }
                break;
            case "gauche":
                if (joueur == true) {
                    pion1y--;
                } else {
                    pion2y--;
                }
                break;
            case "droite":
                if (joueur == true) {
                    pion1y++;
                } else {
                    pion2y++;
                }
                break;
            case "bas":
                if (joueur == true) {
                    pion1x++;
                } else {
                    pion2x++;
                }
                break;
            }



    }
}
