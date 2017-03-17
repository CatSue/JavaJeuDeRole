package tp.java.jdr.objets;

import tp.java.jdr.personnages.EtreVivant;

/**
 * Arme : classe abstraite décrivant une arme
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public abstract class Arme {

    //Nom de l'arme
    protected String nom;

    //Nombre de dégâts
    protected int degats;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */
    public Arme (String pNom, int pDegats){
        nom = pNom;
        degats = pDegats;
    }

    //********************GETTEUR********************//
    /*
    * Getteur
    * Accède au nom de l'arme
    * @return : nom de l'arme
    */
    public String getNom() {
        return nom;
    }

    /*
    * Getteur
    * Accède au nombre de dégâts
    * @return : nombre de dégâts
    */
    public int getDegats() {
        return degats;
    }

    //********************METHODES********************//
    /*
    * Methode Attaque
    * Affiche que l'attaque a été effectuée
    */
    public void Attaque() {
        System.out.println("Attaque effectuee");
    }

}
