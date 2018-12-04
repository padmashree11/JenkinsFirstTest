package sorting_names;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);  
        Scanner input_string= new Scanner(System.in);

    
    int a=  scan.nextInt();
    double b = scan.nextDouble();
    String c = input_string.nextLine();
    
                /* Print the sum of both integer variables on a new line. */
  System.out.println(i+a);         /* Print the sum of the double variables on a new line. */
  		System.out.println((d+b));
          /* Concatenate and print the String variables on a new line; 
         	the 's' variable above should be printed first. */
  		
  s= s.concat(c);       
  System.out.println(s);
  scan.close();
    }
}