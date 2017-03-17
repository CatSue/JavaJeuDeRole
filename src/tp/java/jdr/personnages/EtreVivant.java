package tp.java.jdr.personnages;

import tp.java.jdr.objets.Arme;

/**
 * EtreVivant : classe abstraite décrivant un EtreVivant
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public abstract class EtreVivant {
    //Nom
    protected String nom;

    //Nombre de point de vie
    protected int pv;

    //Type
    protected String type;

    //Position X
    protected int positionX;

    //Position Y
    protected int positionY;

    //********************CONSTRUCTEUR********************//
    /*
    * Constructeur avec paramètres
    */

    public EtreVivant(String pNom, String pType, int pPv) {
        nom = pNom;
        type = pType;
        pv = pPv;
    }

    //********************GETTEUR********************//
    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }

    //********************METHODES********************//
    /*
    * Methode SePositionner
    * @param x : position X
    * @param y : position Y
    */
    public void SePositionner(int x, int y) {
        x = positionX;
        y = positionY;
    }

    /*
    * Methode Attaquer
    * @param cible : cible de l'attaque
    */
    public void Attaquer(EtreVivant cible) {
        cible.RecevoirDegats(this);
    }

    /*
    * Methode RecevoirDegats
    * @param source : source de l'attaque
    */
    public abstract void RecevoirDegats(EtreVivant source);

    /*
    * Methode CalculPoints
    * Calcul les pv après une attaque
    */
    //TODO : ajouter set() pour MAJ pv
    public int CalculPoints (Arme source) {
        int resultat = pv - source.getDegats();
        if (resultat <= 0){
            System.out.println("Felicitaions ! Votre cible est decedee");
        }
        else {
            System.out.println("Il reste a la cible " + resultat + " pv");
        }
        return resultat;
    }

}


