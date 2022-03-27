package Model;

import java.util.*;

public class Niveau2 {

    public static void Niveau2() {

      // On crée la grille et on place
      Plateau g1 = new Plateau(15, 19);
      Eceman E = new Eceman(5,10, g1);
      Banquisedure O = new Banquisedure(11, 11, g1);
            
    
      //On place la banquise dure
    
        //   for (int j =0; j<20;j++)
        // {
        //     int c = 8 + (int)(Math.random() * 6);
        //     int l = 4 + (int)(Math.random() * 10);
            // g1.placer(l,c, 'O');
            
        // }
        
    
        // On place la glace
        for (int j =0; j<6;j++)
        {
             for(int i=4; i<14; i++)
             {
                  g1.placer(i,8+j, 'o');
                 }
    
        }
    
        //On place les murs
    
       int nombreAleatoire2 = 8 + (int)(Math.random() * 6);
        for(int i=7; i<15; i++){
              g1.placer(3,i, 'M');
              // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
              // System.out.println(randomNum);
              }
        for(int i=7; i<15; i++){
            g1.placer(14,i, 'M');
            // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            // System.out.println(randomNum);
            }
       
    //On place la porte
        g1.placer(8,14,'P');
    
    // On place les murs
    
    for(int i=4; i<14; i++){
      g1.placer(i,7, 'M');
      // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
      // System.out.println(randomNum);
      }
    
      for(int i=4; i<14; i++){
        g1.placer(i,14, 'M');
        // int randomNum = ThreadLocalRandom.current().nextInt(0, 19 + 1);
        // System.out.println(randomNum);
        }
            //Affichage de Eceman
            
            g1.afficherEceman(E);
            g1.afficherBanquisedure(O);

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
              case 8: E.deplacerH();
              break;  
              case 2 : E.deplacerB();
              break;
              case 4 : E.deplacerG();
              break;
              case 6 : E.deplacerD();
              break;
              default: System.out.println ("Mauvais chiffre");  
            }
            for (int j=0; j<100; j++ ){
               System.out.println(); 
            }
            g1.afficherEceman(E);
            g1.afficherBanquisedure(O);
        
            }
        
          
            }   

    }
    
