package programeString;

public class SecondLargestNum 
{
    public static void main(String[] args) 
	{
		int[] a = {6,8,2,4,3,1,5,7};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])//Descending Order
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
		//System.out.println("Second Largest Num:"+a[1]);
	}

}
