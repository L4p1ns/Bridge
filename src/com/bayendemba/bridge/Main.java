package com.bayendemba.bridge;

import com.bayendemba.bridge.entities.PorteMaison;
import com.bayendemba.bridge.entities.PorteVoiture;

public class Main {

    public static void main(String[] args) {
        PorteVoiture porteVoiture = new PorteVoiture();
        PorteMaison porteMaison = new PorteMaison();
        System.out.println("##############################################################");
        System.out.println("Ouverture des portes voiture");
        porteVoiture.ouvrir();
        System.out.println("------------------------------------");
        System.out.println("Fermeture des portes voiture");
        porteVoiture.fermer();
        System.out.println("------------------------------------");
        System.out.println("##############################################################");
        System.out.println("##############################################################");
        System.out.println("Ouverture des portes Maison");
        porteMaison.ouvrir();
        System.out.println("Fermeture des portes Maison");
        porteMaison.fermer();
        System.out.println("##############################################################");
    }
}
