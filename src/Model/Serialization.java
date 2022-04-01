package Model;

import java.io.*;

public class Serialization {

public static void save(Serializable obj, String fileName) throws Exception { FileOutputStream fos;
	ObjectOutputStream oos;
	fos = new FileOutputStream(fileName);
	oos = new ObjectOutputStream(fos); oos.writeObject(obj); oos.flush();
	oos.close();
}


public static Object load(String fileName) throws Exception {
    FileInputStream   fis;
    ObjectInputStream ois;
    fis = new FileInputStream(fileName); ois = new ObjectInputStream(fis);
    Object obj = ois.readObject(); ois.close();
    return obj;
	}

}
