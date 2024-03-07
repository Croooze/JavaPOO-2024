package org.example.Exo3;

public class Rectangle {
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double surface() {
        return longueur * largeur;
    }

    public void afficher() {
        System.out.println("Rectangle de longueur " + longueur + " et largeur " + largeur);
    }
}

