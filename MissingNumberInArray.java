package practice;

public class MissingNumberInArray {
	

	public static void main(String[] args) {
		//Conditions to find missing number:-
		//1.Array should not have duplicates
		//2.Array no need to be in sorted order
		//3.Starting and ending value of array should be present in array
		
		MissingNumberInArray obj=new MissingNumberInArray();
		obj.display();
		

	}
	
	public void display()
	{
	
		//Logic =To find missing number
		//sum1=sum of all present elements in array =      1+2+4+5=12
		//sum2=sum of all numbers including missing number= 1+2+3+4+5=15
		//so that missing number=sum2-sum1=missing number
		int a[]= {1,2,3,4,5,6,8,9,10};
		
		int sum1=0;
		
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
			
		}
		
		System.out.println("Sum1 = "+sum1);
		
		int sum2=0;
		
		for (int i = 1; i <=10; i++) {
			sum2=sum2+i;
			
		}
		
		System.out.println("Sum2 = "+sum2);
		
		System.out.println("Missing number = "+(sum2-sum1));
		
		
	}
	
	
	

}
