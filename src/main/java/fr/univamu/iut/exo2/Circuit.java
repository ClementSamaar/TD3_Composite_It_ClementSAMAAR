package fr.univamu.iut.exo2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Circuit extends Composant{
    private ArrayList<Composant> listComposant = new ArrayList();
    @Override
    public void executer() {
        System.out.print("\nCircuit éléctronique\n");
        for (int i = 0; i < listComposant.size(); i++) {
            listComposant.get(i).executer();
        }
    }

    public void ajouterComposant(Composant c){
        listComposant.add(c);
    }
    public void supprimerComposant(Composant c){
        for (int i = 0; i < listComposant.size(); i++) {
            if(listComposant.get(i).equals(c)) listComposant.remove(i);
        }
    }
    //public Composant getComposant(Composant c){

    //}

    public Circuit(){}

}