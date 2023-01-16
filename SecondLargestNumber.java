//10) Find 2nd Largest Number in an Array
public class SecondLargestNumber
{
	public static void main(String arg[])
	{
		SecondLargestNumber obj = new SecondLargestNumber();
		int arr[]={80,90,50,88,50,60,70};
		int check=0;
		int iRet=obj.maiximum(arr);
		System.out.println("Maximum no is :"+iRet);
		
		iRet=obj.checkSecondNumber(arr,iRet);
		System.out.println("Second maximum no is :"+iRet);
		
	}
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
	public int checkSecondNumber(int array[],int maximumNo)
	{
		
		int secondMax=array[0];
		for(int counter=1;counter<array.length;counter++)
		{
			if((array[counter]!=maximumNo)&&(array[counter] > secondMax))
			{
				secondMax = array[counter];
			}
		}
		return secondMax;
	}
	
}