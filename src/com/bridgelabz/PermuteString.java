/**
 * 
 */
package com.bridgelabz;

/**
 * @author PAVITHRA C
 *
 */
public class PermuteString {

	/**
	 * @param args
	 */
	 public static String swapString(String a, int i, int j) {  
	        char[] b =a.toCharArray();  
	        char ch;  
	        ch = b[i];  
	        b[i] = b[j];  
	        b[j] = ch;  
	        return String.valueOf(b);  
	    }  	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Pavithra";  
	        int len = str.length();  
	        System.out.println("All the permutations of the string are: ");  
	        generatePermutation(str, 0, len);  
	    }  
	      
	    //Function for generating different permutations of the string  
	    public static void generatePermutation(String str, int start, int end)  
	    {  
	        //Prints the permutations  
	        if (start == end-1)  
	            System.out.println(str);  
	        else  
	        {  
	            for (int i = start; i < end; i++)  
	            {   
	                str = swapString(str,start,i);  
	                generatePermutation(str,start+1,end);  
	                str = swapString(str,start,i);  
	            }  
	        }  
	}

}
