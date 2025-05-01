//final -- final is basically used to restrict a developer/user

//Three ways we can use final
// final variable-- if we use final in front of variable we can not change the value of that variable
// final method-- if we used final in front of method, we can't override that method
// final class-- if we use final in front of class, we can't extend that class
final class Bank
{
	final float rateInterest=9.51f;
	String managerName="Vishal Bharti";
	public void getRateInterest()
	{
		System.out.println(rateInterest);
	}
	final public void getManagerName()
	{
		System.out.println(managerName);
	}
}
public class FinalKeyword extends Bank{
	public void getManagerName()
	{
		System.out.println("Hi I am overriding");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
