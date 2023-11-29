import java.util.Scanner;

public class HighestScore {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;

	String nameOfStudent = "";
	
	int highestScore = 0 ;
	
	System.out.print("Enter the number of students: ") ;
	int noOfStudents = input.nextInt() ;

	for (int num = 1; num <= noOfStudents; num ++) {
		System.out.print("Enter name of student: ") ;
		String name = input.next() ;
		
		System.out.print("Enter student score: ") ;
		int score = input.nextInt() ;

		if (score > highestScore) {
			highestScore = score ;
			nameOfStudent = name ;
		}	
	}

	if (noOfStudents == 0) {
		System.out.print("You didn't enter any student number") ;
	}
	else {
		System.out.printf("The student with the highest score is %s with a score of %d%n", nameOfStudent, highestScore) ;
		}

}

}