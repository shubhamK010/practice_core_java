package self_practice;

/*
 * 
 * 
 * 
 * Input=1234
 * Output=4321
 */
import java.util.Scanner;

public class reverse_number {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse_number obj=new reverse_number();
		
		obj.display();

	}
	
	public void display()
	
	{
		
		System.out.println("Enter a number =");
		int num=sc.nextInt();
		
		/*
		//Method 1=by using while loop
		
		int rev=0;
		
		
		
		while(num!=0)
			
		{
			
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		
		System.out.println("Number after reversing ="+rev);
		
		*/
		
		
		/*
		
		//Method 2=By using String Buffer
		
		
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println("After reversing by StringBuffer ="+rev);
		
		*/
		
		
		//Method 3=By using StringBuilder
		
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(num);
		
		
		StringBuilder rev=sbl.reverse();
		
		System.out.println("Reverse number by using StringBuilder ="+rev);
		
		
		
		
		
	}

}
