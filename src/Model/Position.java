package Model;

import java.lang.reflect.Array;

import javax.lang.model.type.ArrayType;

public abstract class Position {

private int x;
private int y;

private int xAncienPosition;
private int yAncienPosition;

private char xNouvellePosition;
private char yNouvellePosition;

private char xN;
private char yN;

// Plateau g1 = new Plateau(15, 19);

// char [][] grille = j.getGrille();

public Position (int x, int y){
this.x = x;
this.y = y;
this.xAncienPosition = 0;
this.yAncienPosition = 0;
this.xNouvellePosition = 0;
this.yNouvellePosition = 0;
}



public char getxNouvellePosition(){
    return this.xNouvellePosition;

  }

  public char getyNouvellePosition(){
    return this.yNouvellePosition;

  }

  public void setXNouvellePosition(char b){

    this.xNouvellePosition = b;
  }

  public void setYNouvellePosition(char o){

    this.yNouvellePosition = o;
  }

  
  public int getX(){
    return this.x;
  }

  public void setX( int v){
    this.x = v;
  }

  public int getY(){
    return this.y;

  }

  public void setY( int v){
    this.y = v;
  }

  public int getXAncienPosition(){
    return this.xAncienPosition;
  }

  public int getYAncienPosition(){
    return this.yAncienPosition;
  }

  public void setXAncienPosition( int v){
    this.xAncienPosition = v;
  }

  public void setYAncienPosition( int z){
    this.yAncienPosition = z;
  }

  //  public void placer2(Eceman E, Position position, char t){
    
  //   if (position.getX()<0 || position.getY()<0 || position.getX()>nbLig || position.getY()>nbCol) {
  //       System.out.print ("Erreur de placement!");
  //       return;


  //   }
  //   if (grille[position.getX()][position.getY()] == '#'){
        
  //       grille[position.getXAncienPosition()][position.getYAncienPosition()] = '#';
  //       grille[position.getX()][position.getY()] = t;
  //       position.setXAncienPosition(position.getX());
  //       position.setYAncienPosition(position.getY());

  //   }
  //   else {
  //       System.out.print("Erreur, cette zone n'est pas vide !");
  //   }

  //  }
    
}
