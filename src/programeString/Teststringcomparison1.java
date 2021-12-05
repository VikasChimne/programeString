package programeString;

public class Teststringcomparison1 {  //It compare values ;exicografically and returns an integer value 

	public static void main(String[] args) 
	{
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));//0(s1=s2)
		System.out.println(s1.compareTo(s3));//+1(s1>s3)
		System.out.println(s3.compareTo(s1));//-1(s3<s1)
	}

}
