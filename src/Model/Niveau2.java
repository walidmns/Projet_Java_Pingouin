package Model;

import java.util.*;

public class Niveau2 {

    public static void Niveau2() {


            //Eceman p1 = new Eceman();
            //p1.toString();
            
            Plateau g1 = new Plateau(15, 19);
            Eceman E = new Eceman();
            
            //On place le joueur
            g1.placer(3,3, E.tochar());
        
            // On place la glace
        
            for(int i=4; i<10; i++){
            g1.placer(3,i, 'o');
              
              // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
              // System.out.println(randomNum);
        
              }
        
      //On place la porte
            g1.placer(3,10,'P');
        
        // On place les murs
        
        for(int i=2; i<12; i++){
          g1.placer(2,i, 'M');
          // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
          // System.out.println(randomNum);
          }
        
          for(int i=2; i<12; i++){
            g1.placer(4,i, 'M');
            // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            // System.out.println(randomNum);
            }
        
          g1.placer (3, 2, 'M');
          g1.placer(3, 11, 'M');
          
          
            //Affichage
            g1.afficher();
            g1.deplacerH();
            g1.afficher();
        
            boolean Niveau = true;
            while (Niveau){
                if(g1.passageNiv()){
                  Niveau = false;
                  Niveau3.Niveau3();

                }
            System.out.println("\n Vers ou vous voulez vous vous déplacer ?\n(8= haut, 2 = bas, 4 = gauche, 6= droite)");
            Scanner sc1 = new Scanner (System.in);
            int nb =sc1.nextInt();
            
            switch (nb) {
              case 8: g1.deplacerH();
              break;  
              case 2 : g1.deplacerB();
              break;
              case 4 : g1.deplacerG();
              break;
              case 6 : g1.deplacerD();
              break;
              default: System.out.println ("Mauvais chiffre");  
            }
            for (int j=0; j<100; j++ ){
               System.out.println(); 
            }
            g1.afficher();
            
        
            }
        
          
            }   

    }
    
