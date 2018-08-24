package com.capgemini.isarelationship;

public class Student extends Person{
	
	private int studId;
	private String grade;
	
	public Student(String name, int age, int studId, String grade) {
		super(name, age);
		this.studId = studId;
		this.grade = grade;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", grade=" + grade + "]";
	}
	
	

}
