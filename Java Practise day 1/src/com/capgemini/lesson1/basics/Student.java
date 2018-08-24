package com.capgemini.lesson1.basics;

public class Student {
	
	int id;// properties
	String name;
	float fees;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getFees() {
		return fees;
	}


	public void setFees(float fees) {
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	void display()//method
	{
		System.out.println("ID   : " + id);
		System.out.println("Name : " + name);
		System.out.println("Fees : " + fees);
	}

}
