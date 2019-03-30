package com.bayendemba.bridge.entities;

import com.bayendemba.bridge.interfaces.Clef;

public class PorteVoiture implements Clef {
    @Override
    public void ouvrir() {
        System.out.println("j'appuie sur le button ouvrir de la télécommande .");
    }

    @Override
    public void fermer() {
        System.out.println("j'appuie sur le button fermer de la télécommande.");
    }
}
