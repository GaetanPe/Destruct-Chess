package com.company;
import java.lang.*;
public class Joueur {
    public static void main() {
        // write your code here
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

    }
}
