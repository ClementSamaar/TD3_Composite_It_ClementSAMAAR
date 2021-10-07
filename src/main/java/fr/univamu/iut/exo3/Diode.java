package fr.univamu.iut.exo3;

//(Pattern Composite)
public class Diode extends Composant{
    @Override
    public void executer() {
        System.out.print("Allumage diode\n");
    }

    public Diode(){}
}
