package self_practice;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		
		palindrome_string obj=new palindrome_string();
		
		obj.display();

	}
	
	
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to check a palindrome =");
		
		String name=sc.next();
		
		System.out.println("Original string =\n"+name);
		
		String org_string=name;
		
		String rev="";
		
		System.out.println("Reversed String =");
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
		}
		
		if(rev.equals(org_string))
		{
			
			System.out.println(rev+" is a palindrome string");
		}
		
		else
		{
			
			System.out.println(rev+" is not a palindrome string");
		}
		
		
	}

}
