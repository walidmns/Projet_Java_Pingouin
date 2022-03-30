package Model;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau3 extends Niveau
{
public Niveau3() throws InvalidAttributeValueException {
	super(carte);
	this.objets = new Objet[] {
	new Eceman(5, 3)	
	};
    this.objets = new Objet[]{
    new Tondeuse(10, 14)    
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
