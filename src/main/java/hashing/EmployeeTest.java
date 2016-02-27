package hashing;

import java.util.regex.Pattern;

public class EmployeeTest {

	public static void main(String[] args){
		
		try {
			String s="Bharathsai";
			String s2="Bharathsai";
			String s3=new String("Bharathsai");
			System.out.println(s==s2);
			System.out.println(s==s3);
			System.out.println(s.hashCode());
			System.out.println(s2.intern());
			System.out.println(Pattern.matches("[amn]+", "mnnn"));
		} finally{
			System.out.println("namaste");
		}
		
	}
}
