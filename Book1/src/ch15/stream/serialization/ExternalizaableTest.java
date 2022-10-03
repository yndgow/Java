package ch15.stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	String name;

	public Dog() {}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ExternalizaableTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("external.out"));
		
		try(oos){
			oos.writeObject(myDog);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("external.out"));
		
		Dog dog = (Dog)ois.readObject();
		System.out.println(dog);
		ois.close();
			
	}
}
