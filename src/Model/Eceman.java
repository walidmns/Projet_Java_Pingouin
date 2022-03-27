package Model;
import java.util.*;

public class Eceman extends Position  {
  

    //Attribut
  private int vie; //Vie du perso
  private int xp;
  private Plateau j;
  private char [][] grille;
  //char tmp = Plateau.geto(tmp);

  //Constructeurs

  //Définition de la position de Eceman
  public Eceman(int x, int y, Plateau j)  {
    super(x, y);
    this.grille = j.getGrille();
  }


 //Déplacement

 public void placer(char t){
    
  if (this.getX()<0 || this.getY()<0 || this.getX()>15 || this.getY()>19) {
      System.out.print ("Erreur de placement!");
      return;


  }
  if (grille[this.getX()][this.getY()] == '#'){
      
      grille[this.getXAncienPosition()][this.getYAncienPosition()] = '#';
      grille[this.getX()][this.getY()] = t;
      

  }
  else {
      System.out.print("Erreur, cette zone n'est pas vide !");
  }

 }

 //Déplacement ECEMAN

 public void deplacerB() {
        
  if (this.getX()+1 < 15 && (this.grille[this.getX()+1][this.getY()] == 'o' || this.grille[this.getX()+1][this.getY()] == 'O'|| this.grille[this.getX()+1][this.getY()] == 'P' )) 
  
  this.setXAncienPosition(this.getX());
  this.setYAncienPosition(this.getY()); 
  this.setX(this.getX()+1);

}

public void deplacerH() {

  if (this.getX()-1 > 0 && (this.grille[this.getX()-1][this.getY()] == 'o' || this.grille[this.getX()-1][this.getY()] == 'P' )) 
  
  this.setXAncienPosition(this.getX());
  this.setYAncienPosition(this.getY()); 
  this.setX(this.getX()-1);
}

public void deplacerD() {

  if (this.getY()+1 < 20 && (this.grille[this.getX()][this.getY()+1] == 'o' || this.grille[this.getX()][this.getY()+1] == 'P' )){

    this.setXAncienPosition(this.getX());
    this.setYAncienPosition(this.getY());    
    this.setY(this.getY()+1);
    // j.placer(this.getX(), this.getY(),'w');  
  
  }
  
}

public void deplacerG() {

  if (this.getY()-1 > 0 && (this.grille[this.getX()][this.getY()-1] == 'o' || this.grille[this.getX()][this.getY()-1] == 'P' )) {
  
  this.setXAncienPosition(this.getX());
  this.setYAncienPosition(this.getY()); 
  this.setY(this.getY()-1);
}
}

// Interaction avec brique et tondeuse

// public void interaction(Tondeuse tondeuse){
  
//               if (this.grille[this.getX()][this.getY()-1] == tondeuse.tochar() || this.grille[this.getX()][this.getY()+1] == tondeuse.tochar() 
//               || this.grille[this.getX()+1][this.getY()] == tondeuse.tochar() || this.grille[this.getX()+1][this.getY()] == tondeuse.tochar()) {
                
//                 System.out.println("\n Vers ou vous voulez vous vous déplacer ?\n(8= haut, 2 = bas, 4 = gauche, 6= droite)");
//                         Scanner sc1 = new Scanner (System.in);
//                         int nb =sc1.nextInt();
                        
//                         switch (nb) {
//                           case 8: T.deplacerH();
//                           break;  
//                           case 2 : T.deplacerB();
//                           break;
//                           case 4 : T.deplacerG();
//                           break;
//                           case 6 : T.deplacerD();
//                           break;
//                           default: System.out.println ("Mauvais chiffre");  
//                         }
            
//               }
//             }

  // Accesseurs
  public int getVie(){ //Renvoie la vie
      return vie;
  }
  public int getXp(){
    return xp;
}
 //Setters
  public void setVie(int v) { //Définit la vie
      vie = v;
  }
  public void setXp(int v) {
    xp = v;
  }


public int attaquer() {
    return 5;
}
//Surcharge
public char tochar(){
   // return "Vie du perso =" + vie + "\n Xp = " + xp;
    return 'E';
  }

}