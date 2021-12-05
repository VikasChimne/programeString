package programeString;     //By xor(^) method

public class MissingNumber2 {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,6};
		int xor1=a[0];
		for(int i=1;i<a.length;i++)
		{
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int i=2;i<=(a.length+1);i++)
		{
			xor2=xor2^i;
		}
		System.out.println("Missing Element is:"+(xor1^xor2));
		

	}

}
//Commutative a=5,b=6,c=7    {a+b+=b+a} AND {a*b=b*a}
//Associative    (a+b)+c=a+(b+c)  AND  (a*b)*c=a*(b*c)
//0^0=0
//1^1=0
//0^1=1    
//1^0=1