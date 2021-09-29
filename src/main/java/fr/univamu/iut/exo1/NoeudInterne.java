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
                premiereOperande * deuxiemeOperande;
                break;
            case '+':
                premiereOperande + deuxiemeOperande;
                break;
            case '/':
                premiereOperande / deuxiemeOperande;
                break;
            case '-':
                premiereOperande - deuxiemeOperande;
                break;
            default:
                System.out.println("Erreur : Opérateur inconnu");
        }
        return 0;
    }

    /* Constructeur */
    public NoeudInterne(Expression e1, Expression e2, char operateur){
        super();
        premiereOperande = e1;
        deuxiemeOperande = e2;
        operateurBinaire = operateur;
    }

    /*public NoeudInterne(Nombre nb1, Nombre nb2, char operateur){
        super();
        operateurBinaire = operateur;
    }

    public NoeudInterne(Nombre nb1, char operateur){
        super();
        operateurBinaire = operateur;
    }*/
}
