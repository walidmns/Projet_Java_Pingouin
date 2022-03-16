package Model;

public class TestGrille {
    public static void main(String[] args) {
    Plateau g1 = new Plateau(15, 9);
    
    //On place le joueur
    g1.placer(3,5, 'J');

    //Affichage

    //g1.getCase(2, 4);
    
    System.out.print(g1.getCase(2, 4) + " = J");

    System.out.println("Déplacer");

    }
    
}
