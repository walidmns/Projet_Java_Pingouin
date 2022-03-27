package Model;

import javax.print.attribute.standard.RequestingUserName;

public class Tondeuse extends Position {


    private int x;
    private int y;
    private Plateau j;
    private char [][] grille;
    private char mur = 'M';

    public Tondeuse(int x, int y, Plateau j) {
        super(x,y);
        this.grille = j.getGrille();
      }

    public char tochar (){
        return 'T';
    }
    //Déplacement

 public void deplacerB() {
        
    for (int i=0; i != mur; i++){

        this.setXAncienPosition(this.getX());
        this.setYAncienPosition(this.getY()); 
        this.setX(this.getX()+ i);
    }
    
  }
  
  public void deplacerH() {
  
    while (this.getxNouvellePosition()-1 != 'M'){

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
