package org.example.Exo3;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void depot(double montant) {
        solde += montant;
    }

    public void retrait(double montant) {
        solde -= montant;
    }

    public void virement(CompteBancaire destinataire, double montant) {
        retrait(montant);
        destinataire.depot(montant);
    }

    public double getSolde() {
        return solde;
    }
}

