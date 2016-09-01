package main;

import java.util.Scanner;

/**
 * Created by user on 01/09/2016.
 */
public class main {

    String[] couleurs = {"rouge", "jaune", "vert", "bleu", "orange", "blanc", "violet", "fuchsia"};
    int[] tProp;
    static int[] tSolution;
    int i = 0;
    int j = 0;
    static int choix = 0;
    static Scanner sc = new Scanner(System.in);
    Boolean[] placeCorrecte;
    Boolean[] couleurCorrecte;


    public static void main(String[] args) {
        choixmode();
        affichercouleurs();

    }

    private static void choixmode() {
        System.out.println("MasterMind. \n Mode 1 : Le système génère une combinaison à trouver. \n" +
                " Mode 2 : Vous choisissez une combinaison et le système essaye de la trouver.");

        while (choix != 1 && choix != 2) {
            choix = Integer.parseInt(String.valueOf(sc.nextInt()));
            if (choix == 1) {
                generersolution();
                reponseHumain();
            } else {
                generersolutionHumain();
                resoudresolution();
            }
            System.out.println("Veuillez entrer un nombre correct.");
        }

    }

    private static void generersolutionHumain() {
    }

    private static void reponseHumain() {
    }

    private static void affichercouleurs() {
    }

    private static void resoudresolution() {
    }

    private static void generersolution() {

        int rep1, rep2, rep3, rep4;



    }

}
