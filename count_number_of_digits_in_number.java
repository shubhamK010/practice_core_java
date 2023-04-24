package self_practice;

public class count_number_of_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count_number_of_digits_in_number obj=new count_number_of_digits_in_number();
		obj.display();
		

	}
	
	
	public void display()
	{
		
		int num= 823710949;
		System.out.println("Original Number ="+num);
		
		int count=0;
		
		while(num>0)
		{
			
			num=num/10;
			count++;
		
		}
		
		System.out.println("Count of digits in number ="+count);
		
		
		
		
	}

}
