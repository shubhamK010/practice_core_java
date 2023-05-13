package practice;

public class FactorialNumber {

	public static void main(String[] args) {
		
		FactorialNumber obj=new FactorialNumber();
		//same logic in ascending order multiplication
		obj.display1();
		//same logic in descending order multiplication
		obj.display2();
		

	}
	
	public void display1()
	{
		int num=5;
		
		long factorial=1;
		
		//5=1*2*3*4*5
		for (int i = 1; i <= num; i++) 
		{
			factorial=factorial*i;   //1  2  6  24  120
			
			
		}
		System.out.println("Factorial of a number = "+factorial);
	}
	
	public void display2()
	{
		int num=5;
		
		long factorial=1;
		
		//5=5*4*3*2*1
		
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;  // 5  20  60  120
			
			
		}
		
		System.out.println("Factorial of a number = "+factorial);

		
	}

}
