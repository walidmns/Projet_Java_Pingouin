package Model;
public class Water extends Tuile
{
	public Water(){
		this.representation ='W';
	}


	public void Marche(Objet o) {
		return;
	}

	public boolean Traversable(Objet o) {
		return false;
	}
}
