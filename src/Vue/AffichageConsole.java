package Vue;

import Model.Niveau;
import Model.Objet;


public class AffichageConsole 
{
	
	public static void Afficher(Niveau niveau)
	{
		String output = "";
	
		// On écrit ligne par ligne
		for (int y = 0; y < Niveau.tailleY; y++) {
			// On écrit chaque colonne avant de passer à la ligne suivante
			for (int x = 0; x < Niveau.tailleX; x++) {
				// Pour chaque case, on affiche en priorité un objet s'il y en a un a ces coordonnées
				boolean objetIci = false;
				for (Objet o : niveau.objets) {
					if (o.x == x && o.y == y) {
						// Il y a un objet, on écrit sa représentation
						output += o.representation;
						
						objetIci = true;
						break;
					}
				}
				// S'il y a eu un objet, on n'écrit pas la représentation du terrain en dessous (sinon on aurait 2 caractères pour une même case)
				if (objetIci) {
					continue;
				}
				output += niveau.terrain[y][x].representation;
				
			}
			// Toute les colonnes sont écrites, on passe à la ligne suivante
			output += "\n";
		}
		output += "\n";

		System.out.println(output);
	}
}
