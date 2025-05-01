// String is a class in Java
// String is collection of characters

// Basically there are three ways to create a string

//1 By using string literal
//2 By using new keyword
//3 By converting character array into string 
public class Strings {

	public static void main(String[] args) {
		String s="Kanchan Pandey";
		//Pagal
		String s5="Pagal";
		String s4="KanchanPandey";
		String s1=new String("Rajat Darvhekar");
		
		char c[]= {'J','A','V','A'};
		String s2=new String(c);
		
		String s3="     Python      ";
		
		System.out.println(s);
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		//Methods
		//substring= sequence of characters  ==  basically used to print the characters according to the given index
		//Initial index is included but last index is included
		
		System.out.println(s.substring(1,10));
		
		// toUpperCase toLowerCase
		//basically used to upper case and lower case the string
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		
		// trim()
		// basically used to remove front and back extra spaces
		System.out.println(s3);
		System.out.println(s3.trim());
		
		//new feature in java 11
		//strip() -- basically used to remove extra spaces from both the sides  // as same as trim()
		//stripLeading() -- basically used to remove front spaces
		//striptrailing()-- basically used to remove backspaces
		System.out.println("*************Strip started");
		System.out.println(s3.strip());
		System.out.println(s3.stripLeading());
		System.out.println(s3.stripTrailing());
		
		
		//charAt() -- charAt() used to get the character at a particular index
		System.out.println(s2.charAt(2));
		
		//replace()  -- basically used to replace a character from a string whose index we have given
		System.out.println(s2.replace('V','J'));
		
		// .equalto() -- used to check the data is same or not
		System.out.println(s.equals(s4));
		
		//== used to check the reference is same or not
		System.out.println(s==s4);

		//concat -- used to attach the string concatenation
		System.out.println(s.concat(s5));
		
		
		//isempty isblank
	}

}
