package Model;

import java.util.*;

public class Niveau2 {

    public static void Niveau2(Eceman E) {


      Plateau g1 = new Plateau(15, 19);
    
      //On place le joueur
      g1.placer(5,10, E.tochar());
    
      //On place la banquise dure
    
          for (int j =0; j<20;j++)
        {
            int c = 8 + (int)(Math.random() * 6);
            int l = 4 + (int)(Math.random() * 10);
            g1.placer(l,c, 'O');
        }
    
    
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
    
