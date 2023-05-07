package practice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class generateRandomNumberAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateRandomNumberAndStrings obj=new generateRandomNumberAndStrings();
		//Approach 1=
		//obj.display1();
		//Approach 2=
		//obj.display2();
		//Approach 3=
		obj.display3();

	}
	
	public void display1()
	{
		
		//Approach -By using random class
		
		Random ran=new Random();
		int ran_int=ran.nextInt(10); //to generate ranodm number between 1 to 10
		System.out.println("Random Integer Value = "+ran_int);
		
		
		double ran_dbl=ran.nextDouble();//togenerate random number between 0.0 to 1.0
		System.out.println("Random Double Value = "+ran_dbl);
		
	}
	
	public void display2()
	{
		//Approach 2=By usig Math Class
		
		System.out.println("Random Decimal Value ="+Math.random());
		
	}
	
	public void display3()
	{
		
		//Approach 3=Apache commons-lang API
		
		String random_number=RandomStringUtils.randomNumeric(5);//Generate 5 digits ranodm numbers
		System.out.println("Random Numbers = "+random_number);
		
		
		String random_alphabets=RandomStringUtils.randomAlphabetic(5);//Generate 5 digits ranodm alphabets
		System.out.println("Random Alphabets = "+random_alphabets);
		
		
	}

}
