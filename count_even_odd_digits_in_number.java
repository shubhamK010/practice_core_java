package self_practice;

public class count_even_odd_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_even_odd_digits_in_number obj=new count_even_odd_digits_in_number();
		obj.display();
		

	}
	
	public void display()
	{
		int num=12345;
		System.out.println("Original numbers ="+num);
		int even_count=0;
		int odd_count=0;
		
		while(num>0) //1234  123  12  1 
		{
			
			int rem=num%10;//4  3  2  1
			
			if(rem%2==0)
			{
				
				even_count++;//1 2
			}
			else
			{
				
				odd_count++;//1 2 3
				
			}
			
			
			
			num=num/10;//123 12 1 0
			
			
		}
		
		System.out.println("Even numbers count="+even_count);
		System.out.println("Odd numbers count="+odd_count);
		
		
		
		
		
	}

}
