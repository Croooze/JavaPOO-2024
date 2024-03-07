package org.example.Exo3;

public class Voiture {
    private String couleur;
    private int vitesse;

    public Voiture(String couleur, int vitesse) {
        this.couleur = couleur;
        this.vitesse = vitesse;
    }

    public void rouler() {
        System.out.println("La voiture roule à une vitesse de " + vitesse + " km/h.");
    }

    public void afficher() {
        System.out.println("Voiture de couleur " + couleur);
    }
}

