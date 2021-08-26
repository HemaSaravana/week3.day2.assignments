package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionsUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		List<Integer> numSet1 = new ArrayList<Integer>();   
		List<Integer> numSet2= new ArrayList<Integer>(); 
		for (int i=0;i<arr1.length;i++) {
		numSet1.add(arr1[i]);
		}
		
		for (int i=0;i<arr2.length;i++) {
			numSet2.add(arr2[i]);
			}
		numSet1.retainAll(numSet2);
		System.out.println("Intersections are: "+numSet1);
		
		
			}
	}


