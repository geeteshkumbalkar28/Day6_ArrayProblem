//3) Java Program to print the largest element in an array
import java.lang.*;

public class LargestElement
{	
	public static void main(String arg[])
	{
		Maximum obj = new Maximum();
		
		int arr[]={10,90,50,40,50,60,70};
		
		int iAns=obj.maiximum(arr);
		System.out.println("the largest element in an array is :"+iAns);
	
	}
}
public class Maximum
{
	public int maiximum(int array[])
	{
		int iMax=array[0];
		for(int counter=1;counter<array.length;counter++)
		{
			if(array[counter] > iMax)
			{
				iMax=array[counter];
			}
		}
		return iMax;
	}
}
