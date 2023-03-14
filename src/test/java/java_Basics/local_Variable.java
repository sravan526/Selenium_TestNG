package java_Basics;

public class local_Variable 
{
	static String str = "sravan";// Static Variable
	
	public static void main(String[]args)
	{
		int x=8; //Local Variable
		if(x%2==0)
		{
			System.out.println( x +"value is even number");
		}
		System.out.println( "value is" +str);
		
	}
}

//output is 8value is even number
//value issravan
