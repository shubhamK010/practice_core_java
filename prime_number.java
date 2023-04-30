package self_practice;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		prime_number obj=new prime_number();
		obj.school();

	}
	
	public void display()
	{
		
		int num=3;
		
		int count=0;
		
		if(num>1)
		{
			
			for(int i=1;i<=num;i++)
			{
				
				if(num%i==0)
				{
					
					count++;
					
					
				}
				if(count==2)
				{
					System.out.println("Its a prime number");
				}
				
				else
				{
					System.out.println("Its not a prime number");
				}
			}
		}
		
		
		
		
	}
	
	//same code just another method
	public void work()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num=sc.nextInt();
	
		int count=0;
		
		if(num>1)
		{
			
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
					
				}
			}
			
			if(count==2)
			{
				System.out.println("Its a prime number");
			}
			
			else
			{
				System.out.println("Its not a prime number");
			}
		}
		
		
		
		
	}
	
	
	//same code just another method
	
	public void school()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				
				if(num%i==0)
				{
					count++;
					
				}
				
			}
			if(count==2)
			{
				System.out.println("Its a prime number");
			}
			
			else
			{
				System.out.println("Its not as prime number");
			}
				
		}
		
		
	}

}
