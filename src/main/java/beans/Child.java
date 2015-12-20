package beans;

public class Child extends Parent {

	public Child(){
		System.out.println("Child is initialized");
	}
	public void childMethod(){
		System.out.println("In childMethod()");
	}
	final void testFinal(){
		System.out.println("Testing final");
	}
	
	public static void main(String args[]) throws InterruptedException{

		Child c =new Child();
		//Parent p = new Parent();
		Parent p1 =new Parent();
//when new child() is used all the parent constructors are also initialized
		//when parent p = new child() is used only parent mehods are accesable
		//when child c = new child() is used all parent and child methods are also accesable
	}
}
