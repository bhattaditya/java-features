package github.bhattaditya.java8.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRunner {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ajay", 67));
		students.add(new Student("Aditi", 76));
		students.add(new Student("Sataym", 42));
		students.add(new Student("Lalit", 80));
		students.add(new Student("Ayush", 73));
		
		List<Student> sortedList = sorting(students);
		
		for(Student student: sortedList) {
			System.out.println(student);
		}
	}

	private static List<Student> sorting(List<Student> students) {
		students.sort(Comparator.comparing(Student::getScore));
		
		return students;
		
	}

}
