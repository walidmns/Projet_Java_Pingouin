
package Controller;

import Model.Eceman;
import Model.Niveau1;
import View.MenuAccueil;
import Model.Niveau2;
import Model.Plateau;
public class main {

     public static void main (String[] args) throws Exception {

          MenuAccueil m = new MenuAccueil();
          Eceman E = new Eceman();
          switch (m.getResultat()) {
               case 1 :
               break;
               case 2:
               Niveau1.Niveau1(E); 
               break;
          }

    
}


}