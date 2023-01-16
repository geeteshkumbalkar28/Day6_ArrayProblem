//8) Java Program to print the duplicate elements of an array
import java.lang.*;

public class DuplicateElementArray
{
	public static void main(String arg[])
	{
		ArrayOddPosition obj = new ArrayOddPosition();
		int arr[]={10,90,50,40,50,60,70,80,90,100,110};
		int arrayDuplicate[] = new int[arr.length];
		for(int counter=0;counter<arr.length;counter++)
		{
			arrayDuplicate[counter] = arr[counter];
			System.out.println(arrayDuplicate[counter]);
		}
	}
}
