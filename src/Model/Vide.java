package Model;
public class Vide extends Tuile
{
	public Vide(){
		this.representation ='#';
	}

	public void Marche(Objet o) {
		return;
	}

	public boolean Traversable(Objet o) {
		return false;
	}
}
