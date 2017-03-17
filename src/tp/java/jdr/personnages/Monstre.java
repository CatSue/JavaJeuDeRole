package tp.java.jdr.personnages;

import tp.java.jdr.objets.Arme;

/**
 * Heros : classe qui hérite de la classe EtreVivant
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Monstre extends EtreVivant{
    //Arme utilisée
    private Arme arme;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Monstre(String pNom, String pType, int pPv,  Arme pArme) {
        super(pNom, pType, pPv);
        arme = pArme;
    }

    //********************METHODES********************//
        /*
    * Methode Attaquer
    * @param cible : cible de l'attaque
    */
    @Override
    public void Attaquer(EtreVivant cible){
        System.out.println("Nom du monstre : " + nom + ", Nom de la cible : " + cible.getNom());
        arme.Attaque();
    }

    /*
    * Methode RecevoirDegats
    * @param source : source de l'attaque
    */
    @Override
    public void RecevoirDegats (EtreVivant source){
        System.out.println("Nom du monstre : " + nom + ", Nom de la source : " + source.getNom());
    }

}
