package programeString;

import java.util.Scanner;

public class Addition 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Two Number");
	  int a,b,sum;
	  a=sc.nextInt();
	  b=sc.nextInt();
	  sum=a+b;
	  System.out.println("Addition:" +sum);
	}

}
