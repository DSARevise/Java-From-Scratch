// stringBuffer/ stringbuider -- StringBuffer/stringbuilder is a mutable class which basically allows to update the data even after the memory is allocated 
//

public class StringBufferStringBuilder {

	public static void main(String[] args) {
	StringBuffer s=new StringBuffer("Java is my");
	s.append("love");
	System.out.println(s);
	
	StringBuilder s1=new StringBuilder("Python is my");
	s1.append("love");
	System.out.println(s1);
	
	
	

	}

}
