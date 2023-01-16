//4) Java Program to print the smallest element in an array
import java.lang.*;

public class SmallestElement
{	
	public static void main(String arg[])
	{
		Minimum obj = new Minimum();
		
		int arr[]={10,90,50,40,50,60,70};
		
		int iAns=obj.minimum(arr);
		System.out.println("the largest element in an array is :"+iAns);
	
	}
}
class Minimum
{
	public int minimum(int array[])
	{
		int iMin=array[0];
		for(int counter=1;counter<array.length;counter++)
		{
			if(array[counter] < iMin)
			{
				iMin=array[counter];
			}
		}
		return iMin;
	}
}
