package Model;

import Controleur.Clavier.Direction;

public class Objet
{
	public char representation = '.';
	public boolean lourd = false;
	public int x = 0;
	public int y = 0;

	public Objet(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void Deplacement(Direction droite) throws Exception{


	}

	public void Deplacement() throws Exception{


	}
	public boolean Deplacable() throws Exception{
	return false;

	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
}
