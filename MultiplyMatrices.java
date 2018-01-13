

/* Program :-Multiplication of two matrices    
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

public class MultiplyMatrices{
	public static void main(String [] args){
		try{
		Scanner sc = new Scanner(System.in);
		int m1[][]=new int[10][10];
		int m2[][]=new int[10][10];
		int m3[][]=new int[10][10];		
		
		System.out.println("Matrix 1");
		System.out.print("Enter the Number of Rows: ");
		int r = sc.nextInt();
		
		System.out.print("Enter the Number of Column: ");
		int c = sc.nextInt();
		
		System.out.println();
		System.out.println("Enter the elements of First Matrix: ");
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++)
				m1[i][j]= sc.nextInt();
		}
		
		System.out.println(" First Matrix Elements is:-");
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println();			
		}
		
		System.out.println("Matrix 2");
		System.out.print("Enter the Number of Rows: ");
		int r1 = sc.nextInt();
		
		System.out.print("Enter the Number of Column: ");
		int c1 = sc.nextInt();
		
		System.out.println();
		System.out.println("Enter the elements of Second Matrix: ");
		for (int i=0;i<r1;i++){
			for (int j=0;j<c1;j++)
				m2[i][j]= sc.nextInt();
		}
		
		System.out.println("Second Matrix Elements is:-");
		for (int i=0;i<r1;i++){
			for (int j=0;j<c1;j++){
				System.out.print(m2[i][j]+"\t");
			}
			System.out.println();
		}
		//Calculate Multiplication of Matrix - 
		for (int i=0;i<r;i++){
			for(int j=0;j<c1;j++){
				int sum=0;
			for(int k=0;k<r1;k++)
				sum=sum+(m1[i][k]*m2[k][j]);
				m3[i][j]=sum;
			}
		}
			
		System.out.println();	
		System.out.println("Multiplication of Matrix is - ");
		for (int i=0;i<r;i++){
			for (int j=0;j<c1;j++){
				System.out.print(m3[i][j]+"\t");
			}
			System.out.println();
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
/*
OutPut:-

Matrix 1
Enter the Number of Rows: 2
Enter the Number of Column: 3

Enter the elements of First Matrix:
4
1
3
2
-5
7
 First Matrix Elements is:-
4       1       3
2       -5      7
Matrix 2
Enter the Number of Rows: 3
Enter the Number of Column: 2

Enter the elements of Second Matrix:
-2
3
-4
-2
5
1
Second Matrix Elements is:-
-2      3
-4      -2
5       1

Multiplication of Matrix is -
-12     10
16      16

C:\Users\ayush\Desktop>javac MultiplyMatrices.java

C:\Users\ayush\Desktop>java MultiplyMatrices
Matrix 1
Enter the Number of Rows: 2
Enter the Number of Column: 3

Enter the elements of First Matrix:
4
1
3
2
-5
7
 First Matrix Elements is:-
4       1       3
2       -5      7
Matrix 2
Enter the Number of Rows: 3
Enter the Number of Column: 2

Enter the elements of Second Matrix:
-2
3
-4
-2
5
1
Second Matrix Elements is:-
-2      3
-4      -2
5       1

Multiplication of Matrix is -
3       13
51      23
*/
			