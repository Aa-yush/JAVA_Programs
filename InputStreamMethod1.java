/* 
Program :- To know the size of particular File

*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/



import java.io.*;
public class InputStreamMethod1{
	public static void main(String[] args) throws IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\ayush\\Desktop\\BubbleSort.java");
		byte[] bytes=new byte[1024];
		int r=fis.read(bytes);    // to read bytes of a file
		System.out.println("Length in File is: "+r);
		
	}
}

/*

Output:-

Length in File is: 387

*/