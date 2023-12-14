package entities;

public class Student {

	public String name;
	public double grade;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade + grade2 + grade3;
	}
	
	public double approvationStudent() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0;
		}
	}
	
	
}
