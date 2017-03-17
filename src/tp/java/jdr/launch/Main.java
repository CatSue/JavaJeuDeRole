package tp.java.jdr.launch;

import tp.java.jdr.objets.Epee;
import tp.java.jdr.objets.Gourdin;
import tp.java.jdr.personnages.Heros;
import tp.java.jdr.personnages.Monstre;


/**
 * Main : classe principale.
 *
 * @author Marie PÉTROD
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        //décalaration des armes
        Epee epee1 = new Epee ("Lame de lune", 400, 1.0);
        Epee gl = new Epee("Glaive de guerre", 120000, 1.2);
        Gourdin gourdin1 = new Gourdin("Gros gourdin", 300, 2.2);

        //déclaration des personnages
        Heros eno = new Heros ("Enoriel","Elfe", 12000, epee1);
        Heros ks = new Heros ("Kat Sue", "Guerrière des tenebres", 500000, gl);
        Monstre zp = new Monstre ("Zploutch", "Gobelin", 1000, gourdin1 );

        //eno.SePositionner(10,20);
        //zp.SePositionner(12,22);

        //ks.Attaquer(zp);
        //zp.RecevoirDegats(eno);
        eno.Attaquer(zp);
        zp.Attaquer(eno);

        zp.CalculPoints(epee1);
        eno.CalculPoints(gourdin1);
        //epee.Attaque();
    }
}
