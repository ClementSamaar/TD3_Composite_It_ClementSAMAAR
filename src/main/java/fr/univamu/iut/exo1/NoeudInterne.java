package fr.univamu.iut.exo1;

public class NoeudInterne extends Expression{

    /* ATTRIBUTS */
    private Expression premiereOperande;
    private Expression deuxiemeOperande;
    private char operateurBinaire;

    /* METHODES */
    @Override
    public double calculerValeur() {
        switch (operateurBinaire){
            case '*':
                return premiereOperande.calculerValeur() * deuxiemeOperande.calculerValeur();
            case '+':
                return premiereOperande.calculerValeur() + deuxiemeOperande.calculerValeur();
            case '/':
                return premiereOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
            case '-':
                return premiereOperande.calculerValeur() - deuxiemeOperande.calculerValeur();
            default:
                System.out.println("Erreur : Opérateur inconnu, les deux opérandes seront divisées");
                return premiereOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
        }
    }

    /* Constructeur */
    public NoeudInterne(Expression e1, Expression e2, char operateur){
        super();
        premiereOperande = e1;
        deuxiemeOperande = e2;
        operateurBinaire = operateur;
    }
}
