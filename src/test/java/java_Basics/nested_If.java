package java_Basics;

public class nested_If 
{    
	public static void main(String[] args) 
	{    
		String address = "Delhi, India";    
    
		if(address.endsWith("India")) 
		{    
			if(address.contains("Meerut")) 
			{    
				System.out.println("Your city is Meerut");    
			}
			else if(address.contains("Noida"))
			{    
				System.out.println("Your city is Noida");    
			}
			else
			{    
				System.out.println(address.split(",")[0]);    //this Line will be execute
				System.out.println(address.split(",")[1]);    //this Line will be execute
			}    
		}
		else
		{    
			System.out.println("You are not living in India");    
		}    
	}    
} 

//output is Delhi India