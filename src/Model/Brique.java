package Model;

public class Brique  {

    private int x;
    private int y;

    public Brique(int x, int y ) {
        this.x = x;
        this.y = y;
      }

      public int getX(){ //Renvoie la position
        return this.x;
    }

    public int getY(){ //Renvoie la position
        return this.y;
    }

     public void deplacerB() {
 
        if (this.x +1 < 20) this.x =+ 1;
      }

      public void deplacerH() {
 
        if (this.x -1 < 0) this.x =- 1;
      }

      public void deplacerD() {
 
        if (this.y +1 < 20) this.y =+ 1;
      }

      public void deplacerG() {
 
        if (this.y -1 < 0) this.y =- 1;
      }

    public char tochar(){
        // return "Vie du perso =" + vie + "\n Xp = " + xp;
         return "B".charAt(0) ;
       }
    
}
