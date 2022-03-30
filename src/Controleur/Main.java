package Controleur;

import Model.Niveau;
import Model.Niveau1;
import Model.Niveau2;
import Model.Niveau3;
import Model.Niveau4;
import Model.Niveau5;
import Model.Objet;
import Vue.AffichageConsole;
import Vue.MenuAccueil;


public class Main
{
	public static  Niveau niveau = null;
	public static  Niveau niveau2 = null;
	
	public static void LancerNiveau(Niveau niveau) throws Exception{
		AffichageConsole.Afficher(niveau);
		while(true){
			try {
			Clavier.getDirection();
			// System.out.println("yo");
			for (Objet o : niveau.objets){
				o.Deplacement();

			}
			AffichageConsole.Afficher(niveau);
			if(niveau.fini()){
				System.out.println("Le jeu est terminé");
				break;
			}
				
			} catch (GameUpdateException e) {
				//TODO: handle exception
			}

		 }

	}
	public static void main(String[] args) throws Exception
	{
		
		try {
			// Menu
			MenuAccueil m = new MenuAccueil();
			int resul = 0;
			while(true){

				 resul = m.getResultat();
				 
				if (resul == 2 || resul==3 || resul ==4 ){
					
					break;
				} 

			}

			if (resul ==4){
				return;
			}

			if (resul ==3){
				return;
			}
			// Init (chargement des modèle)
			 niveau = new Niveau1();
			//  System.out.println("coucou");
			

			LancerNiveau(niveau);

			 niveau = new Niveau2();
			 LancerNiveau(niveau);
 
			  
			 niveau = new Niveau3();
			 LancerNiveau(niveau);


			 niveau = new Niveau4();
			 LancerNiveau(niveau);


			 niveau = new Niveau5();
			 LancerNiveau(niveau);

		} catch (Exception e) {
			e.printStackTrace(System.out);
			return;
		}
	}
}
