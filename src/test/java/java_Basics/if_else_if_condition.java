package java_Basics;

public class if_else_if_condition 
{
	public static void main(String [] args)
	{
		int x=7,y=8,z=9;
		if(x>y&&x>z)
		{
			System.out.println("the value of "+x);
		}
		else if(y>x&&y>z)
		{
			System.out.println("the value of"+y);
		}
		else
		{
			System.out.println("the value of "+z);
		}
	}

}
//output is  the value of 9