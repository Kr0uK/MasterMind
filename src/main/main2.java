package main;

import java.util.Scanner;

/**
 * Created by user on 01/09/2016.
 */

public class main2 {

    final static String[] COULEURS = {"Rouge", "Jaune", "Vert", "Bleu", "Orange", "Blanc", "Violet", "Fuchsia"};
    static int[] tProp = new int[4];
    static int[] tSolution = new int[4];
    static int[] tTemp = new int[4];
    static int[][] tResolution = new int[4][4];
    static int i = 0;
    static int j = 0;
    static int essais = 0;
    static int tailleTableau = 4;
    static int choix = 0;
    static Scanner sc = new Scanner(System.in);
    static boolean[] placeCorrecte = new boolean[4];
    static boolean[] couleurCorrecte = new boolean[4];


    public static void main(String[] args) { // Menu principal

        // afficherCouleurs(); // on affiche les couleurs et leur code
        choixMode(); // choix du mode de jeu

    }


    private static void choixMode() {
        System.out.println("MasterMind. \n Mode 1 : Le système génère une combinaison à trouver. \n" +
                " Mode 2 : Vous choisissez une combinaison et le système essaye de la trouver.");

        while (choix != 1 && choix != 2) {
            choix = Integer.parseInt(String.valueOf(sc.nextInt()));
            if (choix == 1) { // la machine génère une solution et l'humain doit le trouver (Mastermind classique)
                afficherCouleurs();
                genererSolution();
                reponseHumain();
            } else if (choix == 2) { // Le joueur génère une solution et la machine la devine
                afficherCouleurs();
                // genererSolutionHumain();
                debug();
                resoudreSolution();
            } else {
                System.out.println("Veuillez entrer un nombre correct.");
            }
        }

    }

    private static void debug() {  // DEBUG
        for (int k : tSolution) {

            tSolution[k] = Integer.parseInt(String.valueOf(sc.nextInt()));
        }
        for (int i : tSolution) {
            System.out.println(tSolution[i]);
        }
    }

    private static void genererSolutionHumain() { // Le joueur propose une combinaison
        //TODO le machin pour gérer une seule couleur
        int couleur;
        int[] coulTest = new int[4];
        for (i = 0; i < tailleTableau; i++) // Pour chaque emplacement de tableau
        {
            System.out.println("Veuillez rentrer une couleur valide (entre 0 et 7)");
            couleur = Integer.parseInt(String.valueOf(sc.nextInt()));
            while (couleur < 0 && couleur > COULEURS.length - 1) {
                System.out.println("Veuillez rentrer une couleur valide (entre 0 et 7)");
                couleur = Integer.parseInt(String.valueOf(sc.nextInt()));
                for (int j = 0; j < coulTest.length; i++) {
                    if (couleur != coulTest[i]) {
                        coulTest[i] = couleur;
                        tSolution[i] = couleur;
                    } else {

                    }
                }

            }
            for (int l : coulTest) {
                System.out.println(coulTest[l]);
            }
        }
    }

    private static void reponseHumain() { // Le joueur tente de trouver la combinaison générée par la machine
        //TODO gérer réponses user
    }

    private static void afficherCouleurs() { // Permet l'affichage des codes et couleurs
        int k = 0;
        for (String couleur : COULEURS) {
            System.out.println(k + " : " + couleur);
            k++;
        }

    }

    private static void resoudreSolution() {// la machine tente de résoudre une combinaison
        //TODO algo résolution
        while ((placeCorrecte != new boolean[]{true, true, true, true}) && (couleurCorrecte != new boolean[]{true, true, true, true})) {
            for (int i : tProp) {
                if (tProp[i] == tSolution[i]) {
                    placeCorrecte[i] = true;
                    couleurCorrecte[i] = true;
                }
            }

            for () {

                for () {

                }
            }


        }

    }


    private static void genererSolution() { // la machine génère une combinaison

        int rep1, rep2, rep3, rep4;
        //TODO générer solution random

    }

}

