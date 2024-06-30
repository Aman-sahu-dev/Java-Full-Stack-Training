package DAY2.SerializationAndDeserializatiuon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationAndDeserializationExample
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student student = new Student("Justin", 8.51, 101, true);
		System.out.println("Before Deserialization:");
		student.print();
		
		//Serialization
		FileOutputStream fileOut = new FileOutputStream("demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fileOut);
		oos.writeObject(student);
		oos.close();
		fileOut.close();
		
		student.regNo = 102; //Changing the static field
		
		//Deserialization
		FileInputStream fileIn = new FileInputStream("demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fileIn);
		
		Student deserializedStudent = (Student) ois.readObject();
		
		System.out.println("\nAfter Deserialization:");
		deserializedStudent.print();
		ois.close();
		fileIn.close();
	}
}
