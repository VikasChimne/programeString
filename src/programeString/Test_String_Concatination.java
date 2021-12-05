package programeString;

public class Test_String_Concatination 
{
       public static void main(String[] args) 
    {
    	String s = "Sachin"+"Tendulkar";
    	System.out.println(s);
	}
}
//The java compiler transform above code to this:
//String s = (new StringBuilder()).append("Sachin).append("Tendulkar").toString();