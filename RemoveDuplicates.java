package week3.day2.assignments;

import java.util.ArrayList;

import java.util.List;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a String as PayPal India
         String str1="PayPal India";
         
		//1.Convert it into a character array
         char[] charArray=str1.toCharArray();

		//2.Declare a Set as charSet for Character
         List<Character> charSet = new ArrayList<Character>();    
          
		//3.Declare a Set as dupCharSet for duplicate Character
         List<Character> dupCharSet = new ArrayList<Character>();  
      
         
         
		//4.Iterate character array and add it into charSet

         for(int i=0;i<charArray.length;i++) {
        	 
        	
        	 if(charSet.contains(charArray[i])==true)
        	 {
        		 dupCharSet.add(charArray[i]) ;
        	 }
        	 else {
        	 charSet.add(charArray[i]);
        	 }
        	 
         }
         
         charSet.removeAll(dupCharSet);
         
         for(int j=0;j<charSet.size();j++) {
        	 
        	if(charSet.get(j)!=' ') {
        	 System.out.println("character set:" +charSet.get(j));
        	}
         }
         
        

	}

	

}
