
package Model;
import Controleur.*;

public class Eceman extends Objet
{


	public Clavier.Direction DirectionActuelle = Clavier.Direction.Bas;

	public Eceman(int x, int y) {
		super(x,y);
		this.representation ='E';
		this.lourd = true;
	}

	public void Deplacement() throws GameUpdateException
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
		
		if (Clavier.Touche == Clavier.Direction.Droite && (this.y == 0 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this))) {
			throw new GameUpdateException("Deplacement invalide");
			}
			
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

