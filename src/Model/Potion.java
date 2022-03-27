package Model;

public class Potion extends Position {
    private int x;
    private int y;
    private Plateau j;
    private char [][] grille;

    public Potion(int x, int y, Plateau j ) {
        super(x,y);
        this.grille = j.getGrille();
      }

    public char tochar (){
        return 'N';
    }
}
