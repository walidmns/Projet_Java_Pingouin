package Model;
import Controleur.*;
import Controleur.Clavier.Direction;

public class Tondeuse extends Objet{
    
    public Tondeuse(int x, int y) {
		super(x,y);
		this.representation = 'T';
		this.lourd = true;
	}
	
	public boolean Deplacable(){
		return true;
	}
	public void Deplacement () throws Exception
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

	case Haut : this.y -- ;
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
