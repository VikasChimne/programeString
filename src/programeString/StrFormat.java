package programeString;

public class StrFormat {

	public static void main(String[] args) 
	{
		 StringBuilder s1 = new StringBuilder("Hello");
		 StringBuilder s2 = new StringBuilder("Java");
         String s = String.format("%s%s", s1,s2);
         System.out.println(s.toString());//HelloJava
	}

}
