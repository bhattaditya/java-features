package github.bhattaditya.java8.examples.student;

import lombok.Data;

@Data
public class Student {
	public String name;
	public int rollNo;
	public char grade;
	public float totalMarks;
	
	public Student(String name, int rollNo, float totalMarks) {
		this.name = name;
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", totalMarks=" + totalMarks + "]";
	}

	
}
