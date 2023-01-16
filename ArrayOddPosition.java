//7) Java Program to print the elements of an array present on odd position
import java.lang.*;

public class ArrayOddPosition
{
	public static void main(String arg[])
	{
		ArrayOddPosition obj = new ArrayOddPosition();
		int arr[]={10,90,50,40,50,60,70,80,90,100,110};
		obj.printOddPosition(arr);
		
	}
	
	public void printOddPosition(int array[])
	{
		for(int counter=1;counter<array.length;counter++)
		{
			if((counter%2)!=0)
			{
				System.out.println("index :"+counter+" Odd position :"+array[counter]);
			}
		}
	}
}
