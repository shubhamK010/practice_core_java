package practice;

import java.util.*;

public class CheckArraysEqual {

	public static void main(String[] args) {
		CheckArraysEqual obj=new CheckArraysEqual();
		//Approach 1=By using Arrays.equals method 
		obj.display1();
		//Approach 2=Without using Arrays.equals method 
		obj.display2();
		
		
		
				

	}
	
	public void display1()
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a, b); //returns boolean value
		
		if(status ==true)
		{
			
			System.out.println("Arrays are equal");
		}
		
		else
		{
			
			System.out.println("Arrays are not equal");
			
		}
		
		
	}
	
	public void display2()
	{
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,9};
		
		
		boolean status=true;
		
		if(a.length==b.length)
		{
			
			//compare rest of the elements
			for(int i=0;i<a.length;i++)//here i have taken length of one array because length of both arrays is equal
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
				
				
			}
			
		}
		
		else
		{
			
			status=false;
		}
		
		
		if(status==true)
		{
			
			System.out.println("Arrays are equal");
		}
		else
		{

			System.out.println("Arrays are not equal");
			
		}
		
		
	}

}
