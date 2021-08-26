package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
			

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
				
				int[] arr = {0,1,2,3,4,7,6,8};
				List<Integer> dataList= new ArrayList<Integer>(); 
				for (int i=0;i<arr.length;i++) {
				dataList.add(arr[i]);
				}
                Collections.sort(dataList);
                
                System.out.println("sorted list: "+dataList);
			     int len=dataList.size();
				for(int i=0;i<len;i++) {
					if(i!=dataList.get(i)) {
						System.out.println(i);
						break;
					}
					
				}
	}

}
