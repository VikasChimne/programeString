package programeString;

//import java.util.Scanner;

public class ArmstrongNumber //The Java Scanner class is used to collect user input
//Scanner is the part of the java.util package,so it can imported without downloading any external libraries
//Scanner reads text from standard input and rerturns it to a program
//It is positive m-digit number that is equal to the sum of the m^th powers of their digit.it is also known as plus perfect

{
	public static void main(String[] args) 
	{
	   // Scanner sc= new Scanner (System.in);
	    //System.out.println("enter number");
		
		int c=0,a,temp;
		int n=153;
		//int n=sc.nextInt();//153=1*1*1+5*5*5+3*3*3
		temp=n;
		while(n>0) 
		{
			a=n%10; //153 = 153%10=3 | 15%10=5 | 1%10=1
			n=n/10; //153/10=15 | 15/10=1 | 1/10=0
			c=c+(a*a*a); //27+0=27 \125+27=152 | 152+1=153
		}
		if(temp==c)
		System.out.println(temp +": is a armstrong number");
		else
		System.out.println(temp +": is not armstrong number");
			
		
	
	}

}
