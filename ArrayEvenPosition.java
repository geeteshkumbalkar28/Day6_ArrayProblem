//5) Java Program to print the elements of an array present on an even position
import java.lang.*;

public class ArrayEvenPosition
{
	public static void main(String arg[])
	{
		ArrayEvenPosition obj = new ArrayEvenPosition();
		int arr[]={10,90,50,40,50,60,70,80,90,100,110};
		obj.printEvenPosition(arr);
		
	}
	
	public void printEvenPosition(int array[])
	{
		for(int counter=1;counter<array.length;counter++)
		{
			if((counter%2)==0)
			{
				System.out.println("index :"+counter+" even position :"+array[counter]);
			}
		}
	}
}
