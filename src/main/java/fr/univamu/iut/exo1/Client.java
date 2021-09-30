package fr.univamu.iut.exo1;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        Expression eg = new NoeudInterne(new Nombre(2), new Nombre(3), '*');
        Expression e = new NoeudInterne(eg, new Nombre(5),'+');
        System.out.println("L'expression entrée vaut : ");
        System.out.println(e.calculerValeur());
    }
}
