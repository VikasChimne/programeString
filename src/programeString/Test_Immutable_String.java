package programeString;


public class Test_Immutable_String {

	public static void main(String[] a)
	{
		String s = "Sachin";
		s.concat("Tendulkar");//concat() method appends the string at the end
		System.out.println(s);//will print Sachin because strings are immutable objects
	}
}