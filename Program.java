package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
	
		student.name = sc.nextLine();
		student.grade = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() <60.0) {
			System.out.println("YOU FAILED!");
			System.out.printf("YOU'RE MISSING %.2f POINTS%n", student.approvationStudent());
		}
		else {
			System.out.println("YOU PASS");
		}
		
		
	
		
		
	sc.close();
	}
}	
		
		
		
		
		
		

