
/* Program :- Write a Java program to find the average marks of 20 students in class for BCSL-043 assignments.
 Make necessary provision for exceptions handling in your program.   
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
import java.util.*;

class Student{
	private int marks;
	private int var[]=new int[20];
	private int temp=0;
	
	public Student(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for 20 students:-");
		for(int i=0;i<20;i++)
			var[i]=sc.nextInt();
	}
	
	public void averageCal(){
		double avg;
		for(int i=0;i<20;i++)
			temp=temp+var[i];
		
		avg=temp/20;
		
		System.out.println("Average Marks is :"+avg);
	}
	
}

class AverageStudent{
	public static void main(String[] args){
		Student stu=new Student();
		stu.averageCal();
	}
}

/*
Output:-
Enter marks for 20 students:-12
23
43
54
24
87
65
56
78
98
98
67
54
87
98
65
45
67
76
45
Average Marks is :62.0

*/