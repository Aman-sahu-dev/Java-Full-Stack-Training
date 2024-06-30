package DAY2.SerializationAndDeserializatiuon;

import java.io.Serializable;

public class Student implements Serializable
{
	String name;
	Double gpa;
	static int regNo;
	transient boolean isHosteller;
	
	Student(String name, Double gpa, int regNo, boolean isHosteller)
	{
		this.name = name;
		this.gpa = gpa;
		this.regNo = regNo;
		this.isHosteller = isHosteller;
	}	
	public void print()
	{
		System.out.println("Name: " + this.name);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Registration Number: " + this.regNo);
		System.out.println("Is Hosteller: " + this.isHosteller);
	}
}