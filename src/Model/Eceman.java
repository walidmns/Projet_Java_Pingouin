
package Model;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

import Controleur.*;
import Controleur.Clavier.Direction;

public class Eceman extends Objet
{


	//public Clavier.Direction DirectionActuelle = Clavier.Direction.Bas;

	public Eceman(int x, int y) {
		super(x,y);
		this.representation ='E';
		this.lourd = true;
	}

	public void Deplacement() throws Exception
	{
		if (Clavier.Touche == Clavier.Direction.Haut && (this.y == 0 || !Main.niveau.terrain[this.y-1][this.x].Traversable(this))) {
				throw new GameUpdateException("Deplacement invalide");
			}
		
		if (Clavier.Touche == Clavier.Direction.Bas && (this.y == 0 || !Main.niveau.terrain[this.y+1][this.x].Traversable(this))) {
				throw new GameUpdateException("Deplacement invalide");
			}
		
		if (Clavier.Touche == Clavier.Direction.Gauche && (this.y == 0 || !Main.niveau.terrain[this.y][this.x-1].Traversable(this))) {
			throw new GameUpdateException("Deplacement invalide");
			}
		
		// if (Clavier.Touche == Clavier.Direction.Droite && (this.y == 0 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this))) {
		// 	throw new GameUpdateException("Deplacement invalide");
		// 	}
			
		if (Clavier.Touche == Clavier.Direction.Droite && (this.y == 0 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this)) ) {
				// Main.niveau.objets[2].Deplacement(Direction.Droite);
				throw new GameUpdateException("Deplacement invalide");
					
			}
				
		// if (Main.niveau.objets.length > 1 && Clavier.Touche == Clavier.Direction.Droite && Main.niveau.objets[1].getX() == this.x +1 && Main.niveau.objets[1].getY() == this.y && Main.niveau.objets[1].Deplacable()) {
		// 		Main.niveau.objets[2].Deplacement(Clavier.Touche.Droite);
		// 		throw new GameUpdateException("Deplacement invalide");
					
		// 	}
			
Main.niveau.terrain[this.y][this.x].Marche(this);

switch(Clavier.Touche){

	case Haut : this.y --;
	break;
	case Bas : this.y ++;
	break;
	case Droite : this.x ++;
	break;
	case Gauche : this.x --;
	break;
}
	}

}

