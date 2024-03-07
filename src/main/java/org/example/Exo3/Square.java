package org.example.Exo3;

public class Square extends Rectangle {
    public Square(double côté) {
        super(côté, côté);
    }

    @Override
    public double surface() {
        return longueur * longueur;
    }
}
