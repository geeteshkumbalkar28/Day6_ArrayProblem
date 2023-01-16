//9) Java Program to sort the elements of an array in ascending order  
import java.lang.*;

public class SortAscending
{	
	public static void main(String arg[])
	{
		Sort obj = new Sort();
		
		int arr[]={80,90,50,88,50,60,70};
		
		obj.sortArray(arr);
		for(int counter=0;counter<arr.length;counter++)
		{
			System.out.println(arr[counter]);
		}
	}
}
class Sort
{
	public void sortArray(int array[])
	{
		int temp =0;
		for(int iCount=0;iCount<array.length;iCount++)
		{
			for(int jCount=iCount+1;jCount<array.length;jCount++)
			{
				if(array[iCount]>array[jCount])
				{
					temp=array[iCount];
					array[iCount]=array[jCount];
					array[jCount]=temp;
				}
			}
		
		}
	}
}
