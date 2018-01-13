

/* Program :- Write a Java program to add two matrices, with proper implementation of 
exception handling mechanism. 

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

public class Matrices{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int matrix1[][]=new int[3][3];
		int matrix2[][]=new int [3][3];
		int matrixadd[][]=new int [3][3];
		
		System.out.println("Enter Matrix 1 Element (9): ");
		for (int i=0;i<3;i++)
			for(int j=0;j<3;j++)
		matrix1[i][j]=sc.nextInt();
	
		System.out.println("Enter Matrix 2 Element (9): ");
		for (int i=0;i<3;i++)
			for(int j=0;j<3;j++)
		matrix2[i][j]=sc.nextInt();
	
		System.out.println("First Matrix is :");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
		System.out.print(matrix1[i][j]+" ");
		System.out.println();
		}
	
		System.out.println("Second Matrix is :");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
		System.out.print(matrix2[i][j]+" ");
		System.out.println();
		}
		
		System.out.println("Addition of  Matrix is :");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
		System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
		System.out.println();
		}
	}
}


/*
Output:-

First Matrix is :
22 14 45
65 74 25
32 45 12
Second Matrix is :
14 15 24
35 74 48
95 65 11
Addition of  Matrix is :
36 29 69
100 148 73
127 110 23

*/