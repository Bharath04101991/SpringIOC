package abstractVSconcrete;

public class Staticblocks {

	int x = 10;
	static{
		System.out.println("n static bloack");
	}
	{
		System.out.println("In normal block");
	}
	public static void main(String[] args) {

		System.out.println("In main block");
		Staticblocks sb = new Staticblocks();
		System.out.println(sb.x);
	}

}
