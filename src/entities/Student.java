package entities;

public class Student {

	public String name;
	public double gradeA;
	public double gradeB;
	public double gradeC;

	public double getMedia() {
		return gradeA + gradeB + gradeC;
	}

	public double getMissing() {
		double soma = gradeA + gradeB + gradeC;
		if (soma < 60)
			return 60 - soma;
		else
			return 0.0;
	}

	public String toString() {
		double soma = gradeA + gradeB + gradeC;
		String finalGrade = String.format("FINAL GRADE = %.2f\n", soma);
		String finalResult = "";
		if (soma >= 60) {
			finalResult += "PASS\n";
		} else {
			finalResult += "FAIL\n";
			finalResult += String.format("MISSING %.2f POINTS\n", 60 - soma);
		}
		
		return finalGrade + finalResult;

	}

}
