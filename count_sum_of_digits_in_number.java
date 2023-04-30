package self_practice;

public class count_sum_of_digits_in_number {

	public static void main(String[] args) {
		count_sum_of_digits_in_number obj=new count_sum_of_digits_in_number();
		obj.display();
	

	}
	
	public void display()
	{
		int num=1234;
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits in number ="+sum);
		
	}

}
