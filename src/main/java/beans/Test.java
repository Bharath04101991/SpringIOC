package beans;


public class Test {
	private String gendor;
	
	
	public Test(){
		//System.out.println("Test class is initialized...........");
	}
	
	
	public void hello(String name)
	{
		System.out.println("Hello "+gendor+" "+name);
	}


	public String getGendor() {
		return gendor;
	}


	public void setGendor(String gendor) {
		this.gendor = gendor;
	}
}
