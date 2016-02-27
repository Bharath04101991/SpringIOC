package beans;

import java.util.ArrayList;
import java.util.List;

public class Java8MethodReferencing {

	public static void main(String[] args){
		
		List<String> names = new ArrayList<>();
		
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
	      
	      names.forEach(Java8MethodReferencing::printName);
	}
	
	 private  static void printName(String name){
		 
		 System.out.println(name);
		
	}
}
