package Model;

public class Plateau {
//Attributs
public int nbLig;
public int nbCol;
public char [][] grille;
// test
//Constructeur
public Plateau (int n, int p){
    nbLig = n;
    nbCol = p;
    grille = new char [nbLig] [nbCol];
    
    
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
 
            grille[i][j] = '#';

        }        

    }
}

//Méthodes

    public void afficher(){
        System.out.println(); // Créer un retour à la ligne
        for(int i=0; i<nbLig; i++){
            for(int j=0; j<nbCol; j++){
    
            System.out.print(grille [i][j]);

            }        
   System.out.println("\n");
    }
    }


public void placer (int l, int c, char t) {
    l =  l-1;
    c = c-1;

    // Test si le joueur se place bien sur la grille

    if (l<0 || c<0 || l>nbLig || c>nbCol) {
        System.out.print ("Erreur de placement!");
        return;


    }
    if (grille[l][c] == '#'){
        grille[l][c] = t;
    }
    else {
        System.out.print("Erreur, cette zone n'est pas vide !");
    }

}

public char getCase (int l, int c){
    return grille [l][c];
}

public void deplacerH(){
    char tmp;
    boolean continuer = true;
    for(int i = 0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
            if (grille[i][j] == new Eceman().tochar() && continuer) //On cherche le joeur
                if (i-1 >= 0 && grille [i-1][j] == 'o' || grille [i-1][j] == 'P' || grille[i-1][j] == 'O') { // On teste la position
                    tmp = grille[i][j]; //On copie le perso
                    grille [i][j] = 'w'; // On vide la case
                    grille [i -1][j] = tmp; // On deplace le perso
                    continuer = false; 
                }

        }

    }

}

public void deplacerB(){
    char tmp;
    boolean continuer = true;
    for(int i = 0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
            if (grille[i][j] == new Eceman().tochar() && continuer) //On cherche le joeur
                if (i+1 >= 0 && grille [i+1][j] == 'o' || grille [i+1][j] == 'P' || grille[i+1][j] == 'O') { // On teste la position
                   // System.out.println(i + " "+ j);
                    tmp = grille[i][j]; //On copie le perso
                    grille [i][j] = 'w'; // On vide la case
                    grille [i +1][j] = tmp; // On deplace le perso
                    continuer = false;
        
                }
        }

    }

}

public void deplacerG(){
    char tmp;
    boolean continuer = true;
    for(int i = 0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
            if (grille[i][j] == new Eceman().tochar() && continuer ) //On cherche le joeur
                if (j-1 >= 0 && grille [i][j-1] == 'o' || grille [i][j-1] == 'P' || grille[i][j-1] == 'O' ) { // On teste la position
                    tmp = grille[i][j]; //On copie le perso
                    grille [i][j] = 'w'; // On vide la case
                    grille [i][j-1] = tmp;
                    continuer = false; // On deplace le perso
                }

        }

    }

}

public void deplacerD(){
    char tmp;
    boolean continuer = true;
    for(int i = 0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){
            if (grille[i][j] == new Eceman().tochar() && continuer) //&& continuer) //On cherche le joeur
                if (j+1 < nbCol && grille [i][j+1] == 'o' || grille [i][j+1] == 'P' || grille[i][j+1] == 'O' ) { // On teste la position
                    tmp = grille[i][j]; //On copie le perso
                    grille [i][j] = 'w'; // On vide la case
                    grille [i][j+1] = tmp;
                   continuer = false; // On deplace le perso
                    
                 
                          
                }
                
        }

    }
 
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
public void afficher2(Brique brique){
    System.out.println(); // Créer un retour à la ligne
    grille [brique.getX()][brique.getY()] = brique.tochar();
    for(int i=0; i<nbLig; i++){
        for(int j=0; j<nbCol; j++){

        System.out.print(grille [i][j]);

        }        
System.out.println("\n");
}
}
 
}




