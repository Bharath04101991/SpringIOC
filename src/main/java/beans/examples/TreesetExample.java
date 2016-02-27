package beans.examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetExample {

	
	public static void main(String[] args){
		
		TreeSet<String> testTree = new TreeSet<String>(new MyNameComparator());
		testTree.add("Bharathsai");
		testTree.add("samaya");
		testTree.add("kavitha");
		testTree.add("laxmipathi");
		
		System.out.println(testTree);
	}
}
	
	class MyNameComparator implements Comparator<String>{

		@Override
		public int compare(String name1, String name2) {
			
			return name1.compareTo(name2);
		}
		
}
