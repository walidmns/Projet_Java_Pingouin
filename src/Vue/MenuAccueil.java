package Vue;
import java.util.*;

public class MenuAccueil {
    private int res;
    private Scanner scan;

    public MenuAccueil() throws Exception {

        System.out.println("1) Règles du jeu");
        System.out.println("2) Nouvelle partie");
        System.out.println("3) Continuer sa partie");
        System.out.println("4) Voir les scores");
        System.out.println("5) Quitter");

        int choix;
        scan = new Scanner(System.in); // Capturing the input
            choix= scan.nextInt();
            switch (choix) {
                case 1:
                res = 1;
                System.out.println("les règles sont : bvjsio");
                    break;
                case 2:
                res=2;
                    // do what you want
                System.out.println("ouais une nouvelle partie");
                    break;
                case 3:
                res = 3;
                    // do what you want
                System.out.println("On continue la partie super");
                    break;
                case 4:
                res = 4;
                System.out.println("Observons les scores");
                    break;
                    // Add the rest of your cases
            }

 
        //while (!choix.equals(5)); // quitting the program
    }

    public int getResultat(){
        return res;
    }
}

