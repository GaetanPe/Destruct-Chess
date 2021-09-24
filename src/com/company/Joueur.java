package com.company;
import java.lang.*;
import java.sql.SQLOutput;
import java.util.*;
import com.company.Main;
public class Joueur {

   static boolean caseLibro;

// Fonction permettant de savoir si il y a encore des case librre autour du joueur
   public static boolean pasDeCase (int pi,int ti){

       boolean gameOver = false;// declare la variable qui va etre retourner

       int haut = ti--;   // declaration des variable pour les case autour du joueur
       int bas = ti++;
       int gauche = pi--;
       int droite = pi++;

       boolean pasHaut = false;// declaration des variable boolean qui vont verifie si il y a des case libre
       boolean pasBas = false;
       boolean pasDroite = false;
       boolean pasGauche = false;

       if(verifCaseLibre(pi,haut)){ // verification de si il y a des case libre autour du joueur
           pasHaut = true;
       }
       if (verifCaseLibre(pi,bas)){
           pasBas = true;
       }
       if (verifCaseLibre(gauche,ti)){
           pasGauche = true;
       }
       if ((verifCaseLibre(droite,ti))){
           pasDroite = true;
       }
       if (pasHaut == true && pasBas == true && pasDroite == true && pasGauche == true){ // verification que toute les case sont occupé
           gameOver = true;
       }
       return gameOver; // on retourne la variable pour savoir si il y a des case libres
   }

    // Fonction permettant de verifié si case est libre avec comme parametre les coordoné x et y du tab
    public static boolean verifCaseLibre(int fi, int gi){

        boolean caseLibre = false;
        String a = Main.grille[fi][gi]; // On range la valeur contenu dans le tab au coord x et y
        if (a.equals("[ ]")) {         // On la compare avec le caractère qui défini une place vide dans le tab

            caseLibre = true;         // Si c'est le bon caractère alors on renvoie la valeur true

        } else {

            caseLibre = false;
        }
        return caseLibre;     // On renvoie soit la valeur true si case libre et false si occupé
    }


    public static void main() {

        boolean jeu = true;



       boolean retourMenu = false;
    
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

            joueur = true;
        }
        else if(premier == 1){

            joueur = false;
        }
        System.out.println(premier);
        // Création des pions 1 et 2 en fonction de leurs coordonnées x et y.

        int pion1x = new Random().nextInt(10);
        int pion1y = new Random().nextInt(11);
        int pion2x = new Random().nextInt(10);
        int pion2y = new Random().nextInt(11);


        do{
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
            String direction ="";
            if(joueur == true){
                System.out.println(pseudo1+" Dans quel direction voulez-vous aller ? ( H / B / G / D )");
                direction = Main.sc.next();
            }
            else if(joueur == false){
                System.out.println(pseudo2+" Dans quel direction voulez-vous aller ? ( H / B / G / D )");
                direction = Main.sc.next();
            }

            //On vérifie que la réponse est bien une direction sinon on redemande au joueur la direction.

            while(!direction.equals("H") && !direction.equals("G") &&  !direction.equals("D") && !direction.equals("B")){
                System.out.println("Veuillez choisir une direction (H / B / G / D)");
                direction = Main.sc.next();
            }

            //On utilise un switch pour avancer le pion dans la direction souhaitée
            // en prenant en compte quel joueur est actuellement en train de jouer.

            switch(direction) {

                case "H":
                    if (joueur == true) {
                        pion1x--;


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
            joueur = !joueur;
        }while (jeu);


           do {
               Scanner xo = new Scanner(System.in);
               System.out.println("Rentrer une coordonné x : ");
               Main.corX = xo.nextInt();
               Scanner yo = new Scanner(System.in);
               System.out.println("Rentrer une coordonné y : ");
               Main.corY = yo.nextInt();

               if (Main.corX > 10 || Main.corX < 0 || Main.corY > 9 || Main.corY < 0) {
                   System.out.println("Entre incorrect");
               }

           } while (Main.corX > 10 || Main.corX < 0 || Main.corY > 9 || Main.corY < 0);

           caseLibro = verifCaseLibre(Main.corX, Main.corY);
           System.out.println(caseLibro);


           if (caseLibro == true){

               Main.grille[Main.corX][Main.corY] = "[X]";
           }



           while (retourMenu != true) {

            System.out.println("Pour revenir au menu taper 1");
            Scanner a = new Scanner(System.in);
            int b = a.nextInt();
            if (b == 1) {
                retourMenu = true;
            }
            else {
                System.out.println("entre incorrect");
            }
        }





    }
}
