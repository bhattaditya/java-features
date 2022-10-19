package github.bhattaditya.java8.examples.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRunner {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ajay", 100001, 58));
		students.add(new Student("Aditi", 100002, 75));
		students.add(new Student("Satyam", 100003, 61));
		students.add(new Student("Ayush", 100004, 80));
		students.add(new Student("Lalit", 100005, 79));
		students.add(new Student("Susmitha", 100006, 93));
		
		for (Student student : students) {
			calculateGrade(student);
		}
		
		List<Student> sortedList = sortingList(students);
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

	private static void calculateGrade(Student student) {
		if (student.getTotalMarks() >= 90) student.setGrade('A');
		else if (student.getTotalMarks() >=80) student.setGrade('B');
		else if (student.getTotalMarks() >=70) student.setGrade('C');
		else if (student.getTotalMarks() >=50) student.setGrade('D');
		else student.setGrade('E');
		
	}
	
	private static List<Student> sortingList(List<Student> students) {
		students.sort(Comparator.comparing(Student::getTotalMarks));
		
		return students;
		
	}

}
