package main;

import java.util.Scanner;

/**
 * Created by user on 01/09/2016.
 */
public class main {

    static String[] couleurs = {"Rouge", "Jaune", "Vert", "Bleu", "Orange", "Blanc", "Violet", "Fuchsia"};
    static int[] tProp;
    static int[] tSolution;
    static int i = 0;
    static int j = 0;
    static int essais = 0;
    static int choix = 0;
    static Scanner sc = new Scanner(System.in);
    static Boolean[] placeCorrecte;
    static Boolean[] couleurCorrecte;


    public static void main(String[] args) { // Menu principal
        affichercouleurs(); // on affiche les couleurs et leur code
        choixmode(); // choix du mode de jeu

    }

    private static void choixmode() {
        System.out.println("MasterMind. \n Mode 1 : Le système génère une combinaison à trouver. \n" +
                " Mode 2 : Vous choisissez une combinaison et le système essaye de la trouver.");

        while (choix != 1 && choix != 2) {
            choix = Integer.parseInt(String.valueOf(sc.nextInt()));
            if (choix == 1) { // la machine génère une solution et l'humain doit le trouver (Mastermind classique)
                generersolution();
                reponseHumain();
            } else if (choix == 2) { // Le joueur génère une solution et la machine la devine
                generersolutionHumain();
                resoudresolution();
            } else {
                System.out.println("Veuillez entrer un nombre correct.");
            }
        }

    }

    private static void generersolutionHumain() { // Le joueur propose une combinaison

        int couleur;
        for (i = 0; i < couleurs.length;i++)
        {

            System.out.println("Veuillez rentrer une couleur valide");
            couleur = Integer.parseInt(String.valueOf(sc.nextInt()));

        }
    }

    private static void reponseHumain() { // Le joueur tente de trouver la combinaison générée par la machine

    }

    private static void affichercouleurs() { // Permet l'affichage des codes et couleurs
        int k = 0;
        for ( String couleur:couleurs) {
            System.out.println(k + " : " +couleur);
            k++;
        }

    }

    private static void resoudresolution() {// la machine tente de résoudre une combinaison
    }

    private static void generersolution() { // la machine génère une combinaison

        int rep1, rep2, rep3, rep4;


    }

}
