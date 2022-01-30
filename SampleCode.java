/*
Accept 2 double values from User (using Scanner). Check data type.
If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
*/

import java.util.*;

class Que1
{
	Scanner sc = new Scanner(System.in); 
   
    public static void main(String args[]){ 
            
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter the First Number: ");
			if(!(sc.hasNextDouble()))
			{
			   System.out.println("Number is not double !");
               return;			   
			}
			
			double d1 = sc.nextDouble();
			System.out.println("Enter the Second Number");
			if(!(sc.hasNextDouble()))
			{
			   System.out.println("Number is not double !");
               return;			   
			}
			double d2 = sc.nextDouble();
			System.out.println("The average is :"+ ((d1+d2)/2));
		
			
			
        }    
	
}



