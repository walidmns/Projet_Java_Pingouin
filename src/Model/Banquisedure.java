package Model;
import Controleur.Main;

public class BanquiseDure extends Tuile {
	public BanquiseDure(){
		this.representation ='O';
		this.objectif = true;
	}

	public void Marche(Objet o) {
		if (o.lourd) {
			Main.niveau.place (o.x, o.y,'o');
		}
		return;
	}

	public boolean Traversable(Objet o) {
		return true;
	}
}
