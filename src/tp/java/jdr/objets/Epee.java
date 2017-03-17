package tp.java.jdr.objets;

/**
 * Epee : classe qui hérite de la classe Arme
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Epee extends Arme {

    //Longueur de l'épée
    private double longueur;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Epee(String pNom, int pDegats, double pLongueur) {
        super(pNom, pDegats);
        longueur = pLongueur;
    }

    //********************METHODES********************//
    /*
    * Methode Attaque
    * Affiche le nom de l'épée, sa longueur et les dégâts infligés
    */
    @Override
    public void Attaque() {
        System.out.println("Nom de l'epee : " + nom + ", Longueur de l'epee : " + longueur + " m, Degats provoques : " + degats + " points");
    }
}
