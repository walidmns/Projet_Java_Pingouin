package Model;

import java.util.Random;

public class Ennemi {
  
    //Attribut
  
  private int vie; //Vie du perso
  private int force ;

  //Constructeurs

  public Ennemi() {
    vie = 30;
    force = 10;
  }
  public Ennemi(int v, int x) {
    vie =v;
    force = x;
  }
 
  // Accesseurs
  public int getVie(){ //Renvoie la vie
      return vie;
  }
  public int getForce(){
    return force;
}
 //Setters
  public void setVie(int v) { //Définit la vie
      vie = v;
  }
  public void setForce(int v) {
    force = v;
  }

  //Service

public int attaquer() {
    Random rand = new Random();
    int d = rand.nextInt(force)+1;
    return d;
}
//Surcharge
public char tochar(){
   // return "Vie du perso =" + vie + "\n Xp = " + xp;
    return "M".charAt(0) ;
  }

}