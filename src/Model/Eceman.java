package Model;

public class Eceman {
  
    //Attribut
  
  private int vie; //Vie du perso
  private int xp;

  //Constructeurs

  public Eceman() {
    vie = 100;
    xp = 0;
  }
  public Eceman(int v, int x) {
    vie =v;
    xp = x;
  }
 
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

  //Service
  public void seReposer(int i){ // 1, 2, 3
    if(i < 1) {
        i=1;
  }
  if (i > 2) {
      i =2;
  }
  if (i == 1){
        vie +=5;
        if(vie > 100){
            vie = 100;
        }
  if (i == 2){
    vie +=5;
    if(vie > 100){
        vie = 100;
            }
            
    }     

  }
}
public int attaquer() {
    return 5;
}
//Surcharge
public char tochar(){
   // return "Vie du perso =" + vie + "\n Xp = " + xp;
    return "E".charAt(0) ;
  }

}