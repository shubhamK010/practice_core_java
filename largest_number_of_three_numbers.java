package self_practice;

import java.util.Scanner;

public class largest_number_of_three_numbers {

	public static void main(String[] args) {
		largest_number_of_three_numbers obj=new largest_number_of_three_numbers();
		obj.display();

	}
	
	public void display()
	{
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number =");
		
		int a=sc.nextInt();
		
		System.out.println("Enter second number =");
		
		int b=sc.nextInt();
		
		System.out.println("Enter third number =");
		
		int c=sc.nextInt();
		
		/*	
		//Logic 1
		 
		if(a>b&&a>c)
		{
			System.out.println(a+" is greater");
		}
		
		else if(b>a && b>c)
		{
			
			System.out.println(b+" is greater");
		}
		
		else
		{
			
			System.out.println(c+" is greater");
		}
		*/
		
		
		/*
		//Logic 2=By ternary operator
		
		
		int largest1=a>b?a:b; //largest of a and b
		int largest2=c>largest1?c:largest1;  //largest of c and largest1
		
		System.out.println("Largest number is ="+largest2);
		*/
		
		//Logic3
		//ternary operator in by comparing all numbers in one line
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println("Largest number is ="+largest);
		
		
	}

}
