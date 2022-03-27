package Model;

import java.util.*;

public class Niveau3 extends Position {

    public static void Niveau3() e {


          
            // On crée la grille

            private Plateau j;
            private char [][] grille;

            public Niveau3(int x, int y, Plateau j)  {
              super(x, y);
              this.grille = j.getGrille();
            }
        
           // Plateau g1 = new Plateau(15, 19);
             
            // On crée la brique et le joueur et on le place
            Brique B = new Brique(8, 12, g1);
            Eceman E = new Eceman(5, 10, g1);
            Tondeuse T = new Tondeuse(6, 11, g1);
            Potion P = new Potion(4,10, g1);
            
           

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
            //Affichage de Eceman, brique et tondeuse
            
            g1.afficherEceman(E);
            g1.afficherBrique(B);
            g1.afficherTondeuse(T);
            g1.afficherPotion(P);
            boolean Niveau = true;
            while (Niveau){
                if(g1.passageNiv()){
                  Niveau = false;
                  Niveau4.Niveau4();

                }
            System.out.println("\n Vers ou vous voulez vous vous déplacer ?\n(8= haut, 2 = bas, 4 = gauche, 6= droite)");
            Scanner sc1 = new Scanner (System.in);
            int nb =sc1.nextInt();
            
            switch (nb) {
              case 8: T.deplacerH();
              break;  
              case 2 : T.deplacerB();
              break;
              case 4 : B.deplacerG();
              break;
              case 6 : B.deplacerD();
              break;
              default: System.out.println ("Mauvais chiffre");  
            }
            for (int j=0; j<100; j++ ){
               System.out.println(); 
            }
            g1.afficherEceman(E);
            g1.afficherBrique(B);
            g1.afficherTondeuse(T);
            g1.afficherPotion(P);
            }
            
              if (this.grille[this.getX()][this.getY()-1] == T.tochar() || this.grille[this.getX()][this.getY()+1] == T.tochar() 
              || this.grille[this.getX()+1][this.getY()] == T.tochar() || this.grille[this.getX()+1][this.getY()] == T.tochar()) {
                
                System.out.println("\n Vers ou vous voulez vous vous déplacer ?\n(8= haut, 2 = bas, 4 = gauche, 6= droite)");
                        Scanner sc1 = new Scanner (System.in);
                        int nb =sc1.nextInt();
                        
                        switch (nb) {
                          case 8: T.deplacerH();
                          break;  
                          case 2 : T.deplacerB();
                          break;
                          case 4 : B.deplacerG();
                          break;
                          case 6 : B.deplacerD();
                          break;
                          default: System.out.println ("Mauvais chiffre");  
                        }
            
              }
            
        
          
                 


    }
    
