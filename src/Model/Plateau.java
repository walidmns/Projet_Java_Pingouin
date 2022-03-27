package Model;

import java.lang.reflect.Array;

import javax.lang.model.type.ArrayType;

public class Plateau {
//Attributs                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
public int nbCol;
private int nbLig;
public char [][] grille;
// test
//Constructeur
public Plateau (int n, int p){
    nbLig = n;
    nbCol = p;
    char tmp;
    grille = new char [nbLig] [nbCol];
    
    
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
 
            grille[i][j] = '#';
            tmp = grille[i][j];

        }        

    }
}


//Méthodes
public char [][] getGrille(){
    return grille;
}

public void setGrille(int a){
a = grille[nbLig][nbCol];
} 


//     public void afficher(){
//         System.out.println(); // Créer un retour à la ligne
//         for(int i=0; i<nbLig; i++){
//             for(int j=0; j<nbCol; j++){
    
//             System.out.print(grille [i][j]);

//             }        
//    System.out.println();
//     }
//     System.out.println();
//     }



public void placer (int x, int y, char t) {
    

    // Test si le joueur se place bien sur la grille

    if (x<0 || y<0 || x>nbLig || y >nbCol) {
        System.out.print ("Erreur de placement!");
        return;


    }
    if (grille[x][y] == '#'){
    
        grille[x][y] = t;
        

    }
    else {
        System.out.print("Erreur, cette zone n'est pas vide !");
    }

}

public char getCase (int l, int c){
    return grille [l][c];
}

public boolean passageNiv() {

   boolean fin = true; 
    for(int i = 0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
     
         if (grille[i][j] == 'P'){
               fin = false;
           
            }
            }
} 
return fin;
}
public void afficherBrique(Brique brique){
    System.out.println(); // Créer un retour à la ligne
    grille [brique.getXAncienPosition()][brique.getYAncienPosition()] = 'w';
    grille [brique.getX()][brique.getY()] = brique.tochar();
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println();
}
System.out.println();
}

public void afficherEceman(Eceman eceman){
    System.out.println();
    grille [eceman.getXAncienPosition()][eceman.getYAncienPosition()] = 'w'; // Créer un retour à la ligne
    grille [eceman.getX()][eceman.getY()] = eceman.tochar();
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println();
}
System.out.println();
}

public void afficherTondeuse(Tondeuse tondeuse){
    System.out.println(); // Créer un retour à la ligne
    grille [tondeuse.getXAncienPosition()][tondeuse.getYAncienPosition()] = 'w';
    grille [tondeuse.getX()][tondeuse.getY()] = tondeuse.tochar();
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println();
}
System.out.println();
}

public void afficherPotion(Potion potion){
    System.out.println(); // Créer un retour à la ligne
    grille [potion.getXAncienPosition()][potion.getYAncienPosition()] = 'w';
    grille [potion.getX()][potion.getY()] = potion.tochar();
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println();
}
System.out.println();
}
public void afficherBanquisedure(Banquisedure Banquisedure){
    System.out.println(); // Créer un retour à la ligne
    grille [Banquisedure.getXAncienPosition()][Banquisedure.getYAncienPosition()] = 'o';
    grille [Banquisedure.getX()][Banquisedure.getY()] = Banquisedure.tochar();

    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println();
}
System.out.println();
}
}




