package package_2;

import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		ArrayList<Integer>arr =new ArrayList<Integer>();
		arr.add(10);
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Blue");
		System.out.println("ArrayInteger"+arr);
		System.out.println("ArrayString"+arr1);
//		add at element 
		arr1.add("Red");
		System.out.println("ArrayString"+arr1);
//		add index
		arr1.add(1,"Yellow");
		System.out.println("ArrayString"+arr1);
//acess element 
		System.out.println(arr1.get(2));
//			Update element
		arr1.set(1, "Orange");
		System.out.println(arr1);
//		Remove string
		arr1.remove(2);
		System.out.println(arr1);
		arr1.add("Red");
		System.out.println(arr1);
		
	}
	

}
