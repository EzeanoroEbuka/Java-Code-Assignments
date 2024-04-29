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
	
	double total = 0;
	double average = 0;
	int[][] studentSubject = new int[students][subjects];
	double[] arrTotal = new double[students];
	double[] arrAverage = new double[students];
	int[] position = new int[students];

	for(int count = 0;count < students; count++) {
		for(int counter = 0;counter < subjects;counter++) {
			System.out.println("Entering Score for Student " + (count + 1));
			System.out.println("Enter Score for Subject " + (counter + 1));
			int subjectCollector = scan.nextInt();
			total += subjectCollector; 
			studentSubject[count][counter] = subjectCollector;
			String promptTwo = ("""
	  Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	  Saved Successfully
				""");	
			System.out.println(promptTwo);
		} 
		average = total / subjects;
		arrTotal[count] = total;
		arrAverage[count] = average;
		total = 0;
	}
	
	System.out.printf("================================================================================\n");
	System.out.println();	
	System.out.printf("STUDENT\t\t");
	for(int count = 1;count <= subjects;count++) {
		System.out.print("SUB" + count + "\t");
	}
	System.out.printf("TOT \t AVE \t   POS\n");
	System.out.println();
	System.out.printf("==================================================================================\n");

	for(int count = 0;count < students; count++) {
		System.out.print("Student " + (count +1) + "\t ");
		for(int counter = 0;counter < subjects;counter++) {
			System.out.print(studentSubject[count][counter] + "\t");
		}
		System.out.printf("%.0f\t",arrTotal[count]);
		System.out.printf("%.2f\t",arrAverage[count]);
		System.out.println();
		for(int i = 1;i <= students;i++) {
			double firstIndex = arrTotal[0];
			if(arrTotal[count] > firstIndex)
				position[count] = i;
			if(arrTotal[count] < position[count] && arrTotal[count] > firstIndex)
				position[count] = (i +1);
			if(arrTotal[count] < firstIndex)
				position[count] = students;
		}
		System.out.print(position[count]);			
	}

}



}	



