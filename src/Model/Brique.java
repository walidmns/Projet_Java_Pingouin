package Model;
import java.time.chrono.MinguoChronology;

import Controleur.*;
public class Brique extends Objet {
    public Brique(int x, int y) {
		super(x,y);
		this.representation = 'B';
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
	
	if (Clavier.Touche == Clavier.Direction.Gauche && (this.x == 0 || !Main.niveau.terrain[this.y][this.x-1].Traversable(this))) {
		throw new GameUpdateException("Deplacement invalide");
		}
	
	if (Clavier.Touche == Clavier.Direction.Droite && (this.x == 0 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this)) && Main.niveau.terrain[this.y][this.x-1].representation == 'E' ) {
		
		throw new GameUpdateException("Deplacement invalide");
		}

switch(Clavier.Touche){

	 case Haut : if(Main.niveau.objets[0].x == Main.niveau.objets[2].x && Main.niveau.objets[0].y == Main.niveau.objets[2].y ){
		this.y --;}
	break;
	case Bas : if(Main.niveau.objets[0].x == Main.niveau.objets[2].x && Main.niveau.objets[0].y == Main.niveau.objets[2].y ){
		this.y ++;}
	break;
	
	case Droite :
	if(Main.niveau.objets[0].x == Main.niveau.objets[2].x && Main.niveau.objets[0].y == Main.niveau.objets[2].y ){
		this.x ++;}
		// System.out.println(Main.niveau.terrain[this.y][this.x-1].representation); 
	break;
	case Gauche : if(Main.niveau.objets[0].x == Main.niveau.objets[2].x && Main.niveau.objets[0].y == Main.niveau.objets[2].y ){
		this.x --;}
	break;
}
	}

}
