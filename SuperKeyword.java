//Super -- Immediate parent class object

// Used to call constructor inside constructor
// used to access variable of parent class
// used to access method of parent class in the method of child class
// can be used as a argument as well

class Model {
	int modelId = 201;
	String modelName = "LamboUrus101";
	double modelCost = 10000000.00;

	public Model() {
		System.out.println("Hi I am a default constructor in Model class");
	}

	public Model(int modelId, String modelName, double modelCost) {
		this();
		this.modelCost = modelCost;
		this.modelId = modelId;
		this.modelName = modelName;
		System.out.println(modelId + " " + modelName + " " + modelCost);
	}

	public void setCarOwner(String ownerName) {
		
		System.out.println(ownerName);
	}
}





public class SuperKeyword extends Model {

	public SuperKeyword() {

		
		super(101,"MERCEDES",2000000);
		System.out.println("Hi I am a default cosntructor in SuperKKeyword class");
	}
	
	public void getCarOwner()
	{
		super.setCarOwner("Kanchan Pandu");
		System.out.println("Car Owner Details fetched");
	}

	public static void main(String[] args) {
		SuperKeyword s=new SuperKeyword();
		s.getCarOwner();
	}

}
