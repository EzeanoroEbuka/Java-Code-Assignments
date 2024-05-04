import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade {
  public static void main(String...args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Number of Student");
	int students = scan.nextInt();
	
	System.out.println("Enter Number of Subjects");
	int subjects = scan.nextInt();
	
	String prompt = ("""
	Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	Saved Successfully
		""");	
	System.out.println(prompt);
	
	int totalTwo = 0;
	int total = 0;
	double average = 0;
	int[] indexCollector = new int[2];

	int[][] studentSubject = new int[students][subjects];

	int[] arrTotal = new int[students];
	double[] arrAverage = new double[students];
	
	int[] position = new int[students];
	int[] highestSubScore = new int[subjects]; 
	int[] lowestSubScore = new int[subjects];
	
	for(int count = 0;count < students; count++) {

		for(int counter = 0;counter < subjects;counter++) {
			System.out.println("Entering Score for Student " + (count + 1));
			System.out.println("Enter Score for Subject " + (counter + 1));
			int subjectCollector = scan.nextInt();
		
			total += subjectCollector;
			studentSubject[count][counter] = subjectCollector;

			System.out.println("""
			Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			Saved Successfully
				""");		
	 	}
		average = total / subjects;
		arrTotal[count] = total;
		
		arrAverage[count] = average;
		total = 0;


	}
	for(int counter = 0;counter < subjects; counter++) {
		lowestSubScore[counter] = 100;
		for(int count = 0;count < students;count++) {	
			if(studentSubject[count][counter]  < lowestSubScore[counter])
				lowestSubScore[counter] = studentSubject[count][counter];
				indexCollector[0] = count;
			if(studentSubject[count][counter]  > highestSubScore[counter])
				highestSubScore[counter] = studentSubject[count][counter];
				indexCollector[1] = count;
		}
		
	}
	position = SortFunction.positionSorting(arrTotal);
	

	System.out.printf("=========================================================================================================================\n");
	System.out.println();	
	System.out.printf("STUDENT\t\t");
	for(int count = 1;count <= subjects;count++) {
		System.out.print("SUB" + count + "\t");
	}
	System.out.printf("TOT \t AVE \t   POS\n");
	System.out.println();
	System.out.printf("==========================================================================================================================\n");

	for(int count = 0;count < students; count++) {
		System.out.print("Student " + (count +1) + "\t ");
		
		for(int counter = 0;counter < subjects;counter++) {
			System.out.print(studentSubject[count][counter] + "\t");
		
		}
		System.out.print(arrTotal[count] + "\t");


		System.out.printf("%.2f\t  ",arrAverage[count]);

		System.out.print(position[count]);

		System.out.println();
	}
	System.out.printf("=========================================================================================================================\n");

	System.out.println();

	System.out.printf("=========================================================================================================================\n");
	

	System.out.println();
	
	System.out.printf("======================================================\n");
	System.out.println("SUBJECT SUMMARY");
		
	for(int j = 0; j < subjects;j++) { 
	System.out.println("Highest scoring Student is:  Student " + indexCollector[1] + " " + highestSubScore[j]);
	System.out.println("Lowest scoring Student is:  Student " + indexCollector[0] + " " +lowestSubScore[j]);
	}
	System.out.printf("======================================================\n");


}

}	

