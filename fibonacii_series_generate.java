package self_practice;

public class fibonacii_series_generate {

	public static void main(String[] args) {
		
		fibonacii_series_generate obj=new fibonacii_series_generate();
		obj.display();

	}
	
	public void display()
	{
		int n1=0,n2=1;
		int sum=0;;
	
		System.out.print(n1+" "+n2); // 0  1
		
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);//1  2  3  5  8  13  21  34
			
			n1=n2;
			n2=sum;
			
		}
		
		
	}

}
