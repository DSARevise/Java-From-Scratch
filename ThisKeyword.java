//this Supaer- both are keywords

// this -- current class object
//1. It is used to differ local variable and instance variable 
//2.  It is used to call constructor in a contructor and method in a method
// rule : It needs to be on the first line(until java 21 -overridden after 21 java)
//3. It can be used a return type
//4. It can be used as argument 

public class ThisKeyword {
	
	
	//instance variable
	int id=1001;
	int rollNo;
	int departmentName;
	String name="Rajat Darvhekar";
	double marks=90.12;
	
	public ThisKeyword()
	{
		System.out.println("Hi I am a default constructor in this class");
	}
	public ThisKeyword( int id, String name, double marks) {//local variable
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
		
		System.out.println(id+ " "+name+" "+marks);
		
	}
	public int sayHello()
	{
		System.out.println("Hey !! sayHello()");
		return id;
		
	}
	public void sayBye()
	{
		this.sayHello();
		System.out.println("Bye!! sayBye()");
	}
	
	
	public static void main(String[] args) {
		ThisKeyword t=new ThisKeyword(101, "Kanchan Pandu", 95);
		t.sayBye();

	}

}
