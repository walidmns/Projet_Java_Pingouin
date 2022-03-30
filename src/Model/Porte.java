package Model;

public class Porte extends Tuile
{
	public Porte(){
		this.representation ='P';
	}

	public void Marche(Objet o) {
		// Terminer le niveau
		if (o instanceof Eceman) {
			// Terminer le niveau
		}
		return;
	}

	public boolean Traversable(Objet o) {
		return true;
	}
}
