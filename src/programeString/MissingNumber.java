package programeString;    //By Sum

public class MissingNumber 
{
     public static void main(String[] args) 
     {
		int[] a = {1,2,3,4,6,7,8};
		int n = a.length+1;
		int total_sum = n*(n+1)/2;//n=expected no elements
		int sum=0;
		for(int i=0;i<a.length;i++)
		//for(int i:a)
		{
			sum=sum+a[i];
		}
		System.out.println("Missing no.is:"+(total_sum-sum));
	}

}

//	int[] a= {10,20,30,40};
//	for(int i:a)
//	{
//		System.out.println(i+",");
//	}
//}}