
/* Program checking whether a character is Uppercase or Lowercase !!  
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
public class CaseCharacter{
	public static void main(String[] args){
		Character c1=new Character('a');
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);     
		if(c1.isUpperCase(ch))
			System.out.println("Character is Upper case ");
		else
			System.out.println("Character is Lower case ");
		
	}
	
}