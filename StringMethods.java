
/* Program to understand "Concept of String Methods"  
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

public class StringMethods{
	public static void main(String []args){
		String st=new String("Aayush is Great!!");
		System.out.println(st); // Print String
		System.out.println(st.length()); // return length of String
		System.out.println(st.indexOf(104));  // 104 is 'h' return index
		System.out.println(st.lastIndexOf(97)); // 97 is 'a' last occurence
		System.out.println(st.indexOf('G'));
		System.out.println(st.replace('a','s')); // replace a->s
		System.out.println(st.toLowerCase()); // convert in Lowercase
		System.out.println(st.toUpperCase()); // convert in Uppercase
		
		
	}
}

/*
Output:-
Aayush is Great!!
17
5
13
10
Asyush is Grest!!
aayush is great!!
AAYUSH IS GREAT!!
*/