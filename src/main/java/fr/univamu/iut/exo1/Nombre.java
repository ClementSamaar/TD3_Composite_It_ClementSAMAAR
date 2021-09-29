package fr.univamu.iut.exo1;

public class Nombre extends Expression{

    /* ATTRIBUTS */
    private int valeur;

    /* METHODES */
    @Override
    public double calculerValeur() {
        return 0;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /* Constructeur */
    public Nombre(int i) {
        super();
        valeur = i;
    }
}
