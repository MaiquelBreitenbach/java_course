package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Student name:");
		student.name = sc.nextLine();
		System.out.println("Grade A:");
		student.gradeA = sc.nextDouble();
		System.out.println("Grade B:");
		student.gradeB = sc.nextDouble();
		System.out.println("Grade C:");
		student.gradeC = sc.nextDouble();
		
		System.out.println(student.toString());
		
		sc.close();
	}

}
