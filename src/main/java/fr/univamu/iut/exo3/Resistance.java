package fr.univamu.iut.exo3;

//(Pattern Composite)
public class Resistance extends Composant{
    @Override
    public void executer() {
        System.out.print("Résistance\n");
    }

    public Resistance() {}
}
