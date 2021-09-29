package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
        Expression eg = new NoeudInterne(new Nombre(2), new Nombre(3), '*');
        Expression e = new NoeudInterne(eg, new Nombre(5),'+');
    }
}
