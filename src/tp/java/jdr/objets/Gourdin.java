package tp.java.jdr.objets;

/**
 * Gourdin : classe qui hérite de la classe Arme
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Gourdin extends Arme {

    //Poids du gourdin
    private double poids;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Gourdin(String pNom, int pDegats, double pPoids) {
        super(pNom, pDegats);
        poids = pPoids;
    }

    //********************METHODES********************//
    /*
    * Methode Attaque
    * Affiche le nom du gourdin, son poids et les dégâts infligés
    */
    @Override
    public void Attaque() {
        System.out.println("Nom du gourdin : " + nom + ", Poids du gourdin : " + poids + " kg, Degats provoques : " + degats + " points");
    }
}
