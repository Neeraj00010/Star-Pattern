import java.util.Scanner;   //java ADE class to read inputs

public class Lab1 {
	int value;      //variable for mutator parameter
	
	public void setValue(int n) {    //mutator with integer parameter
		this.value = n;
	}
	
	private Scanner keyboard = new Scanner(System.in);  //method to read input
	
	public void printPattern(int n)  {      //overloaded constructor with integer parameter
		
		//pattern 1st
		for(int i = 0; i <= n; i++)
		{
			for(int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();  
	}
		
		System.out.println(); //skip line
		
		//pattern 2nd
		for(int i = 0; i <= n; i++) {
			for(int j = n; j > i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
		
		System.out.println();
		
		//pattern 3rd
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= i)
				{
			     System.out.print("*");
		        }
				else
				{
				 System.out.print(" ");
				}
		}
		System.out.println();
	}
		
		System.out.println();
		
		//pattern 4th
	    for(int i = 1; i <= n; i++) {
		     for(int j = n; j >= 1; j--) {
			     if(j <= i) 
			     {
		           System.out.print("*");
	             }
			     else
			     {
		          System.out.print(" ");
			     }
		}
		System.out.println();
	}
}
	public void printPattern()          //overloaded constructor without parameter
	{       
		while(true) 
		{
		System.out.println("Enter height (-1 to quit): ");
		int height = keyboard.nextInt();         //height variable to take input from user
		
		if(height%2 != 0 && height >= 5 && height != -1)     //condition 1 run, if the entered value match 3 statements
		{
			//upper half of butterfly like star-pattern
			for(int i = 1; i <= height; i++) {
				for(int j = 1; j <= height; j++) {
				if(j <= i) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
				for(int k = height; k >= 1; k--) {
					if(k <= i) 
					{
						System.out.print("*");
					}
					else 
					{
							System.out.print(" ");
					}
		}
				System.out.print("\n");
        }  //exit outer for loop
			
			 //bottom half of butterfly like star-pattern
		     for(int l = 1; l <= (height-1); l++)
		     {
			 for(int m = (height-1); m >= l; m--) 
			 {
					System.out.print("*");
			 }
			 for(int n = 1; n <= l*2; n++)
			 {
					System.out.print(" ");
			 }
			 for(int p= (height-1); p >= l; p--) 
			 {
			 System.out.print("*");
			 }
			 System.out.println();
        } //exit outer for loop 
		     
        }  //exit if statement
		
		else if(height == -1)   //condition 2 run, if condition 1 does not match requirements
		{
			System.out.println("Goodbye.. Have a nice day!");
			break;
		}
		
		else              //condition 3 run, if both conditions are false
		{
			System.out.println("Inalid entry... Must be an odd number 5 or greater than it. Please Try Again.\n");
		}
		
	}  //exit while loop	
  }  //exit overloaded constructor
}  //exit class