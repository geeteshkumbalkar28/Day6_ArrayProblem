//6) Java Program to print the elements of an array in reverse order
import java.lang.*;

public class ElementReverse
{
	public static void main(String arg[])
	{
		ElementReverse obj = new ElementReverse();
		int arr[]={10,90,50,40,50,60,70,80,90,100,110};
		obj.reverse(arr);
	}
	public void reverse(int array[])
	{
		for(int counter = array.length-1;counter>=0;counter--)
		{
			System.out.println(array[counter]);
		}
	}
	
}