package org.example.Exo3;

public class Program {

public static void main(String[] args) {

    Voiture maVoiture = new Voiture("Rouge", 120);
        maVoiture.rouler();
        maVoiture.afficher();

    Utilisateur utilisateur1 = new Utilisateur(25, "Alice");
        utilisateur1.parler();
        utilisateur1.afficher();

    Rectangle monRectangle = new Rectangle(5, 8);
        System.out.println("Surface du rectangle : " + monRectangle.surface());
        monRectangle.afficher();

    Square monCarre = new Square(4.0);
        System.out.println("Surface du carré : " + monCarre.surface());
        monCarre.afficher();

    Client client = new Client("David", 2000);
    Client client2 = new Client("Marion", 5000);
        client.afficherSolde();
        client.effectuerDepot(100);
        client.effectuerRetrait(500);
        client.effectuerVirement(client2, 300);
        System.out.println("Solde du compte de David après les différentes opérations de dépôt, retrait et virement : ");
        client.afficherSolde();
        client2.afficherSolde();
    }
}

