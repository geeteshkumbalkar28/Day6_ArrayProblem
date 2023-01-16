//1) Java Program to print the elements of an array
import java.lang.*;

public class Array
{
	public static void main(String arg[])
	{
		int arr[] = new int[6];  //declaration 
		//initialization 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		
		//traversing array
		for(int counter=0; counter<arr.length;counter++)//length is the property of array
		{
			System.out.println(arr[counter]);
		}
	}
}