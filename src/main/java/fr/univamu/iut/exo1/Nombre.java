package fr.univamu.iut.exo1;

public class Nombre extends Expression{

    /* ATTRIBUTS */
    private int valeur;

    /* METHODES */
    @Override
    public double calculerValeur() {
        return valeur;
    }

    /* Constructeur */
    public Nombre(int i) {
        super();
        valeur = i;
    }
}
