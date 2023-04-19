package practice_core_java;

public class printing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printing_array obj=new printing_array();
		obj.display();
		

	}
	
	public void display()
	{
		
		int a[]= {10,20,30,40,50,60};
		
		System.out.println("Printing the array elements=");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

}
