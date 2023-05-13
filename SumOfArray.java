package practice;

public class SumOfArray {

	public static void main(String[] args) {
		SumOfArray obj=new SumOfArray();
		//Approach 1=By using normal for loop
		obj.display1();
		//Approach 2=By using enhanced for loop
		obj.display2();
		

	}
	
	public void display1()

	{
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++)
		{
			
			sum=sum+a[i]; //5+2+7+9+6=29
			
		}
		System.out.println("Sum of elements in array ="+ sum);
	}
	
	public void display2()
	{
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		for(int value:a)//here a is array name  and value is any variable used
		{
			sum=sum+value;//5  7  14  23  29
			
		}
		
		System.out.println("Sum of elements in array ="+ sum);
		
		
		
		
		
	}
}
