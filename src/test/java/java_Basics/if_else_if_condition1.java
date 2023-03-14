package java_Basics;

public class if_else_if_condition1 
{
	public static void main (String [] args)
	{
		String city = "Delhi";
		
		if(city == "Chennai")
		{
			System.out.println("the city name is Chennai");
		}
		else if(city == "Hyderabad")
		{
			System.out.println("the city name is Hyderabad");
		}
		else if (city == "Banglore")
		{
			System.out.println("the city name is Banglore");
		}
		else
		{
			System.out.println("the city name is " +city);// this output will print
		}
	}

}

//output is the city name is Delhi