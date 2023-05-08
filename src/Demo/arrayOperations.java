package Demo;

import java.util.*;

public class arrayOperations {
	public static void main(String[] args) {
		//single dimensional array
		int arr[] = {100,200,300,400,500};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of an array: "+arr[i]);
		}
		//multidimensional array
		int arr1[][] = {{1,2,3,4},{5,6,7,8}};
		System.out.println("Length of the first row: "+ arr1[0].length);
		System.out.println("Length of the second row: "+ arr1[1].length);
	}
}
