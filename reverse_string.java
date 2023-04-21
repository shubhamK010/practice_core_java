package self_practice;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_string obj=new reverse_string();
		
		obj.display();

	}
	
	public void display()
	{
		
		String s="shubham";
		
		String rev="";
		
		for (int i = s.length()-1; i>=0; i--)
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println("Reversed string ="+rev);
	}

}
