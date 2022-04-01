package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.naming.directory.InvalidAttributeValueException;

public class Niveau1 extends Niveau
{
public Niveau1() throws InvalidAttributeValueException {
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

	public void serialiserNiveau1() throws IOException{
    	FileOutputStream fos;
    	ObjectOutputStream oos;
		fos = new FileOutputStream("data.dat");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(this);
		oos.flush();
		oos.close();
 
    
}
    
    public static Niveau1 deserialiserPortefeuille() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fis;
        ObjectInputStream ois;
        fis = new FileInputStream("data.dat");
        ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return (Niveau1) obj;
    }  

}

