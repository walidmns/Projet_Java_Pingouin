package Model;

public class Briquetterie // public static
{
	public static Tuile Produit(char c)
	{
		switch (c) {
			case 'W':
				return new Water();
			case 'o':
				return new BanquiseFine();
			case 'O':
				return new BanquiseDure();
			case 'P':
				return new Porte();
			case 'M':
				return new Mur();
			default:
				return new Vide();
		}
	}
}
