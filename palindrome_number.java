package self_practice;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome_number obj=new palindrome_number();
		obj.display();
	}
	
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check palindrome number =");
		int num=sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		
		System.out.println("Reversed number ="+rev);
		
		if(rev==org_num)
		{
			
			System.out.println(org_num+" is a palindrome number");
		}
		else
		{
			
			System.out.println(org_num+" is not a palindrome number");
		}
		
	}

}
