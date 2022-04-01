
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
		if (Clavier.Touche == Clavier.Direction.Haut && (this.y == 0|| !Main.niveau.terrain[this.y-1][this.x].Traversable(this))) {
				throw new GameUpdateException("Deplacement invalide");
			}
		
		if (Clavier.Touche == Clavier.Direction.Bas && (this.y == 15 || !Main.niveau.terrain[this.y+1][this.x].Traversable(this))) {
				throw new GameUpdateException("Deplacement invalide");
			}
		
		if (Clavier.Touche == Clavier.Direction.Gauche && (this.x == 0 || !Main.niveau.terrain[this.y][this.x-1].Traversable(this))) {
			throw new GameUpdateException("Deplacement invalide");
			}
	

		if (Clavier.Touche == Clavier.Direction.Droite && (this.x == 19 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this))) {
			
			throw new GameUpdateException("Deplacement invalide");
			}
			
		// if (Clavier.Touche == Clavier.Direction.Droite && (this.y == 0 || !Main.niveau.terrain[this.y][this.x+1].Traversable(this)) ) {
		// 		Main.niveau.objets[2].Deplacement(Direction.Droite);
		// 		throw new GameUpdateException("Deplacement invalide");
					
		// 	}
				
		// if (Main.niveau.objets.length > 1 && Clavier.Touche == Clavier.Direction.Droite && Main.niveau.objets[1].getX() == this.x +1 && Main.niveau.objets[1].getY() == this.y && Main.niveau.objets[1].Deplacable()) {
		// 		Main.niveau.objets[2].Deplacement(Clavier.Touche.Droite);
		// 		throw new GameUpdateException("Deplacement invalide");
					
		// 	}
			
Main.niveau.terrain[this.y][this.x].Marche(this);

switch(Clavier.Touche){

	case Haut :
	if(Main.niveau.objets.length > 1){
		if(Main.niveau.objets[0].x == Main.niveau.objets[3].x && Main.niveau.objets[0].y == Main.niveau.objets[3].y ){
			System.out.println("knsfoc");
			this.lourd = false;
			this.y --;
		}
		   else{
			this.y --;
		   
		   }
		   

	}
	else{
		this.y --;
	   
	   }
	break;
	case Bas :
	if(Main.niveau.objets.length > 1){
		if(Main.niveau.objets[0].x == Main.niveau.objets[3].x && Main.niveau.objets[0].y == Main.niveau.objets[3].y ){
			System.out.println("knsfoc");
			this.lourd = false;
			this.y++;
		}
		   else{
			this.y ++;
		   
		   }
		   

	}
	else{
		this.y ++;
	   
	   }
	break;

	case Droite : 
	if(Main.niveau.objets.length > 1){
		if(Main.niveau.objets[0].x == Main.niveau.objets[3].x && Main.niveau.objets[0].y == Main.niveau.objets[3].y ){
			System.out.println("knsfoc");
			this.lourd = false;
			this.x++;
		}
		   else{
			this.x ++;
		   
		   }
		   

	}
	else{
		this.x ++;
	   
	   }
	break;

	case Gauche :
	if(Main.niveau.objets.length > 1){
		if(Main.niveau.objets[0].x == Main.niveau.objets[3].x && Main.niveau.objets[0].y == Main.niveau.objets[3].y ){
			System.out.println("knsfoc");
			this.lourd = false;
			this.x--;
		}
		   else{
			this.x --;
		   
		   }
		   

	}
	else{
		this.x --;
	   
	   }
	break;

	default: throw new Exception();


	}
	
	}
}
