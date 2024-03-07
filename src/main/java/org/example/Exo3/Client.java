package org.example.Exo3;

public class Client {
    private String nom;
    private CompteBancaire compte;

    public Client(String nom, double soldeInitial) {
        this.nom = nom;
        this.compte = new CompteBancaire(soldeInitial);
    }

    public void afficherSolde() {
        System.out.println("Solde du compte de " + nom + " : " + compte.getSolde());
    }

    public void effectuerDepot(double montant) {
        compte.depot(montant);
    }

    public void effectuerRetrait(double montant) {
        compte.retrait(montant);
    }

    public void effectuerVirement(Client destinataire, double montant) {
        compte.virement(destinataire.compte, montant);
    }
}

