package Model;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau2 extends Niveau
{
public Niveau2() throws InvalidAttributeValueException {
	super(carte);
	this.objets = new Objet[] {
	new Eceman(5, 3)	

	};


	
		//TODO Auto-generated constructor stub
	}
	public static String  carte =  

			"###################"+
			"###################"+
			"####MMMMMMMMMM#####"+
			"####MoooooooPM#####"+
			"####Mooooooo#MMM###"+
			"####Mooooooo#M#####"+
			"####M##########M###"+
			"####M##############"+
			"####MMMMMMMMMMMM###"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################";
   
			
}
