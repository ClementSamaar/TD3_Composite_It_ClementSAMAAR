package fr.univamu.iut.exo3;

import java.util.ArrayList;

//(Pattern Composite)
public class Circuit extends Composant{
    private ArrayList<Composant> listComposant = new ArrayList();
    @Override
    public void executer() {
        System.out.print("\nCircuit électronique\n");
        for (Composant composant : listComposant) {
            composant.executer();
        }
    }

    public void ajouterComposant(Composant c){
        listComposant.add(c);
    }
    public void supprimerComposant(Composant c){
        for (int i = 0; i < listComposant.size(); i++) {
            if(listComposant.get(i).equals(c)) {
                listComposant.remove(i);
                break;
            }
        }
    }
    public ArrayList<Composant> getComposant(){
        return listComposant;
    }

    public Circuit(){}

}