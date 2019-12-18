import java.util.Scanner;

public class GitClass {
	
	
	public static void main (String arg [])
	{
		//String Bread;
		String Size;
		int Age;
		String Color;
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Please enter Bread");
		System.out.println("Please enter Size");
		System.out.println("Please enter Age");
		System.out.println("Please enter Color");
		
		Size=sc.next();
		Age=sc.nextInt();
		Color=sc.next();
		
		if(Size.equals("Small") && Age == 2 && Color.equals("White"))
			
		{
					
			System.out.println("Dog bread is Maltes" );
			
		}
		
		else 
			if (Size.equals("Midium") && Age == 3 && Color.equals("Brown"))
			{
				System.out.println("Dog bread is Chow Chow" );
			}	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
