package Model;

public class Brique extends Position{

    private int x;
    private int y;
    private Plateau j;
    private char [][] grille;

    public Brique(int x, int y, Plateau j ) {
        super(x,y);
        this.grille = j.getGrille();
      }

    public void deplacerB() {
        
      if (this.getX()+1 < 15 && (this.grille[this.getX()+1][this.getY()] == 'o' || this.grille[this.getX()+1][this.getY()] == 'P' )) 
      
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

    public char tochar(){
        // return "Vie du perso =" + vie + "\n Xp = " + xp;
         return 'B';
       }
    
}
