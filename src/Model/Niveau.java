package Model;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau
{
	
	public Tuile[][] terrain = null;
	public Objet[] objets = null;
	public static int tailleX = 19;
	public static int tailleY = 15;

	public Niveau(String carte) throws InvalidAttributeValueException
	{

		if (carte == null || carte.length() != tailleX*tailleY) {
			throw new InvalidAttributeValueException("Carte au mauvais format");
		}
		terrain = new Tuile[tailleY][tailleX];
		// Creer terrain
		for (int y = 0; y < tailleY; y++) {
			for (int x = 0; x < tailleX; x++) {
				char c = carte.charAt(x+y*tailleX);
				terrain[y][x] = Briquetterie.Produit( c );
			}
		}

		
	}

	public void place (int x, int y, char t) {
    

		// Test si le joueur se place bien sur la grille
	
		if (x<0 || y<0 || x>tailleX || y >tailleY) {
			System.out.print ("Erreur de placement!");
			return;
	
	
		}
		terrain[y][x] = Briquetterie.Produit( t );
		
				}
	public boolean fini(){
		for (int y = 0; y < tailleY; y++) {
			for (int x = 0; x < tailleX; x++) {
				if(terrain[y][x].objectif){
					return false;
				}
				
			}
		}
		Eceman E = (Eceman)objets[0];
		return terrain[E.y][E.x] instanceof Porte;
		
	
		
	}
	
}
