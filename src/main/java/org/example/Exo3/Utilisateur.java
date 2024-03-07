package org.example.Exo3;

public class Utilisateur {
    private int age;
    private String nom;

    public Utilisateur(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public void parler() {
        System.out.println(nom + " parle.");
    }

    public void afficher() {
        System.out.println("Utilisateur " + nom + ", âge : " + age + " ans.");
    }
}

