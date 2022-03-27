package Model;

public class Banquisedure extends Position {

    private int x;
    private int y;
    private Plateau j;
    private char [][] grille;

    public Banquisedure(int x, int y, Plateau j ) {
        super(x,y);
        this.grille = j.getGrille();
      }
    
      public char tochar(){
        // return "Vie du perso =" + vie + "\n Xp = " + xp;
         return 'O';
       }
    
}
