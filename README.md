# Le Design Patern Bridge
 
 >Interface  Clef:
        
```java
package com.bayendemba.bridge.interfaces;

public interface Clef {
    public void ouvrir();
    public void fermer();
}
```
 >Class  PorteVoiture
 
```java
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

``` 
  >Class PorteMaison
  
```java
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

```
  > La Methode Main()
  
```java
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

```