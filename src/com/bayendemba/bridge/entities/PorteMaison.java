package com.bayendemba.bridge.entities;

import com.bayendemba.bridge.interfaces.Clef;

public class PorteMaison implements Clef {
    @Override
    public void ouvrir() {
        System.out.println("> Je tourne la clef vers la droite .");
    }

    @Override
    public void fermer() {
        System.out.println("> Je tourne la clef vers la gauche .");
    }
}
