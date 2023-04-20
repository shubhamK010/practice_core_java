package self_practice;

public class swapping_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		swapping_the_number obj=new swapping_the_number();
		
		obj.display();

	}
	
	public void display()
	{
		int a=10;
		int b=20;
		
		System.out.println("Number before swapping =");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		int t=a;
		a=b;
		b=t;
		
	
		System.out.println("Number after swapping =");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		
		
	}

}
