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

	case Haut : if(Main.niveau.objets[0].x == Main.niveau.objets[1].x && Main.niveau.objets[0].y-1 == Main.niveau.objets[1].y ){
	while (Main.niveau.terrain[this.y][this.x+1].Traversable(this)) {
		this.y --;
		Main.niveau.terrain[this.y][this.x].Marche(this);	
	}  
}
	break;
	case Bas : if(Main.niveau.objets[0].x == Main.niveau.objets[1].x && Main.niveau.objets[0].y+1 == Main.niveau.objets[1].y ){
		while (Main.niveau.terrain[this.y][this.x+1].Traversable(this)) {
			this.y ++;
			Main.niveau.terrain[this.y][this.x].Marche(this);	
		}  
	}
	break;
	case Droite : 
	if(Main.niveau.objets[0].x == Main.niveau.objets[1].x-1 && Main.niveau.objets[0].y == Main.niveau.objets[1].y ){
	while (Main.niveau.terrain[this.y][this.x+1].Traversable(this)) {
		this.x ++;
		Main.niveau.terrain[this.y][this.x].Marche(this);	
	}  
}
	
	
	break;
	case Gauche : if(Main.niveau.objets[0].x == Main.niveau.objets[1].x+1 && Main.niveau.objets[0].y == Main.niveau.objets[1].y ){
		while (Main.niveau.terrain[this.y][this.x+1].Traversable(this)) {
			this.x --;
			Main.niveau.terrain[this.y][this.x].Marche(this);	
		}  
	}
	break;
}
	}

}
