package programeString;

public class Palindrome
{
  public static void main(String[] a)
   {
    int r,sum=0,temp;
    int n=454;
    temp=n;
    while(n>0)
    {
     r=n%10;
     sum=(sum*10)+r;
     n=n/10;
    }
    if(temp==sum)
   System.out.println("Palindrome no.");
    else
    System.out.println(" Not Palindrome no.");
  }
}


