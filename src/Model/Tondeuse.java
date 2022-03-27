package Model;

import javax.print.attribute.standard.RequestingUserName;

public class Tondeuse extends Position {


    private int x;
    private int y;
    private Plateau j;
    private char [][] grille;
    private char mur = 'M';
    private char xN;
    private char yN;

    public Tondeuse(int x, int y, Plateau j) {
        super(x,y);
        this.grille = j.getGrille();
      
      }

      public char getXn(){
        return this.xN;
      }
      public char getYn(){
        return this.xN;
      }
      public void setXn(char o){
      
        this.xN = o;
      }
      public void setYn(char o){
      
        this.yN = o;
      }

    public char tochar (){
        return 'T';
    }
    //Déplacement

 public void deplacerB() {
        
  while (this.grille[this.getX()+1][this.getY()] != 'M'){
    
    this.setXAncienPosition(this.getX());
    this.setYAncienPosition(this.getY()); 
    this.setX(this.getX()+1);

  }
    
  }
  
  public void deplacerH() {
  
    while (this.grille[this.getX()-1][this.getY()] != 'M'){

        this.setXAncienPosition(this.getX());
        this.setYAncienPosition(this.getY()); 
        this.setX(this.getX()-1);
      }
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
}
