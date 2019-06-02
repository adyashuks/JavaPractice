package output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialiseDeserialiseMain {

	public static void main(String[] args)  {
		
		SerialiseDeserialise sd = new SerialiseDeserialise("Adya", "Shukla", new Date(20-12-1994));
		try {
		FileOutputStream fos = new FileOutputStream("SerialiseDeserialise.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(sd);
		os.close();
		fos.close();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		
		//Deserialize 
		SerialiseDeserialise obj = null;
		try {
			FileInputStream fis = new FileInputStream("SerialiseDeserialise.ser");
			ObjectInputStream is = new ObjectInputStream(fis);
			obj = (SerialiseDeserialise) is.readObject();
			is.close();
			fis.close();
			System.out.println("FIrstname = " + sd.firstname);
			System.out.println("FIrstname = " + sd.lastname);
			System.out.println("FIrstname = " + sd.bday);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
