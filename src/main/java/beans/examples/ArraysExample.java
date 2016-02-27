package beans.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArraysExample {

	
	public static void main(String[] args){
		
		int[] arr={1,1,1,2,3,3};
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0 ; i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
		
		
}
