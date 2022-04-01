package Model;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau3 extends Niveau
{
public Niveau3() throws InvalidAttributeValueException  {
	super(carte);
	this.objets = new Objet[] {
		new Eceman(5, 3) , new Tondeuse(8, 5), new Brique(6, 5), new Potion(10, 5)};
		// new Brique(8, 4), new Potion(6, 5)};	
		//TODO Auto-generated constructor stub
	
		}
	public static String  carte =  

			"###################"+
			"####MMMMMMMMM######"+
			"####MooOooooM######"+
			"####MooOoooooM#####"+
			"####MooooooMM######"+
			"####MooooooPM######"+
			"####MooooooMM######"+
			"####MooooooMM######"+
			"####MoooooooM######"+
			"####MoooooooM######"+
			"####MMMMMMMMM######"+
			"###################"+
			"###################"+
			"###################"+
			"###################";
			
	// if(niveau.fini()){
	// 	Niveau2.Niveau2();
	// 		}	
}
