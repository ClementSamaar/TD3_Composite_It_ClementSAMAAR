package fr.univamu.iut.exo2;

public class Client {
    public static void main(String[] args) {
        Circuit circuit1 = new Circuit();
        Condensateur condensateur1 = new Condensateur();
        Diode diode1 = new Diode();
        Resistance resistance1 = new Resistance();
        circuit1.ajouterComposant(condensateur1);
        circuit1.ajouterComposant(diode1);
        circuit1.ajouterComposant(resistance1);
        circuit1.executer();
        circuit1.supprimerComposant(diode1);
        circuit1.executer();
    }
}
