package Model;

import Controleur.Main;

public class BanquiseFine extends Tuile
{
	public BanquiseFine(){
		this.representation ='o';
		this.objectif = true;
	}
	

	public void Marche(Objet o) {
		if (o.lourd) {
			Main.niveau.place (o.x, o.y,'W');
		}
		return;
	}

	public boolean Traversable(Objet o) {
		return true;
	}
}
