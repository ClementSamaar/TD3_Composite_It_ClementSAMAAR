package fr.univamu.iut.exo3;

//(Pattern Composite)
public class Condensateur extends Composant {
    @Override
    public void executer() {
        System.out.print("Condensateur\n");
    }

    public Condensateur(){}
}
