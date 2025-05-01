//Constructor -- constructor is a special type of method which is used to initialize an instance of a class/ object
// constructor is a block of code that is called when the object is created   //implictly -- internally //explicitly -- externally
// types of constructor -- default and parameterized
class Car {
	public Car() {
		System.out.println("Hi I am car default constructor");
	}
}

public class Constructors extends Car{

	public Constructors() {
		super();// inact as immediate parent class object
		System.out.println("Hi I am default constructor");
	}

	public Constructors(int id, String name, double salary) {
		this();// basically used as current class object
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {

		
		Constructors c = new Constructors(101, "Rajat Darvheakr", 15000);

	}

}
