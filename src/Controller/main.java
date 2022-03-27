
package Controller;

import Model.Eceman;
import Model.Niveau1;
import View.MenuAccueil;

import Model.Plateau;
public class main {

     public static void main (String[] args) throws Exception {

          MenuAccueil m = new MenuAccueil();
          
          switch (m.getResultat()) {
               case 1 :
               break;
               case 2:
               Niveau1.Niveau1(); 
               break;
          }

    
}


}