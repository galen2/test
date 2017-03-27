package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
public class Client {
	File file = new File("/Users/yourmall/Documents/back/person.out");
	public void serialication(){
		try {
			Person p = new Person("zhangsan", "123");
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject("save a object:\n");
			output.writeObject(p);
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void deSerialication(){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)); 
			String s = (String)ois.readObject();
			Person p = (Person)ois.readObject();
			System.out.println("The String:"+s);
			System.out.println("The person:"+p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		Client client = new Client();
//		client.serialication();
		client.deSerialication();
	}
}
