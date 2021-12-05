package programeString;

public class Test_String_Comparison 
{
   public static void main(String[] a)
   {
	   String s1 = "Sachin";
	   String s2 = "Sachin";
	   String s3 = new String("Sachin");
	   String s4 = "Deepak";
	   System.out.println(s1.equals(s2));//true
	   System.out.println(s1.equals(s3));//true
	   System.out.println(s1.equals(s4));//false
   }
}
