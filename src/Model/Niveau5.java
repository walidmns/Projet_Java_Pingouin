package Model;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau5 extends Niveau
{
public Niveau5() throws InvalidAttributeValueException {
	super(carte);
	this.objets = new Objet[] {
	new Eceman(5, 3)	

	};


	
		//TODO Auto-generated constructor stub
	}
	public static String  carte =  

			"###################"+
			"###################"+
			"####MMMMMMMMM######"+
			"####MooooooPM######"+
			"####MMMMMMMMM######"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################"+
			"###################";
			
	// if(niveau.fini()){
	// 	Niveau2.Niveau2();
	// 		}	
}

