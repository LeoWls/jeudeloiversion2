package fr.jeudeloiversion2;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        int caseCourante = 0;
        int nbLancers = 5;
        int caseObjectif = 20;
        Random generateur = new Random();

        System.out.println("bienvenue ! commencçons...!");
        caseCourante = jouerPartie(generateur, caseCourante, nbLancers);
        afficherResultatPartie(caseCourante, caseObjectif);

    }

    public static int lancerDeDés(Random generateur, int caseCourante, int numéroLancer) {
        int lancer = generateur.nextInt(6) + 1;
        caseCourante = caseCourante + lancer;
        System.out.println(String.format("lancer %d : vous avez fait %d. Vous êtes sur la case %d.", numéroLancer,
                lancer, caseCourante));
        return caseCourante;
    }

    public static void afficherResultatPartie(int caseCourante, int caseObjectif) {
        if (caseCourante == caseObjectif) {
            System.out.println("Vous avez gagnez !");
        } else {
            System.out.println("Vous avez perdu !");
        }
    }

    public static int jouerPartie(Random generateur, int caseCourante, int nbLancers) {
        for (int i = 1; i <= nbLancers; i++) {
            caseCourante = lancerDeDés(generateur, caseCourante, i);
        }
        return caseCourante;

    }
}
