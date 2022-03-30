package Controleur;
import java.util.*;

public class Clavier {
    public enum Direction{
        Haut, Bas, Gauche, Droite, Aucune

    } 
    public static Direction Touche = Direction.Aucune;

    public static void getDirection() throws Exception{
    
    System.out.println("\n Vers ou vous voulez vous vous déplacer ?\n(8= haut, 2 = bas, 4 = gauche, 6= droite)");
    Scanner sc1 = new Scanner (System.in); 
        int nb =sc1.nextInt();
        
        switch (nb) {
          case 8: Touche = Direction.Haut;
          break;  
          case 2 :  Touche = Direction.Bas;
          break;
          case 4 :  Touche = Direction.Gauche;
          break;
          case 6 :  Touche = Direction.Droite;
          break;  
          default: throw new Exception();
        }
    
    }
}
