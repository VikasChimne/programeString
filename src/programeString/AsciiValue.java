package programeString;

import java.util.Scanner;

public class AsciiValue
{
public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
      {
        System.out.println("Enter a Char");
        char chr = sc.next().charAt(0);
        int asciiValue = chr;
        System.out.println("The Ascii Value of " + chr + " is: " +asciiValue);
      }
  }
}
