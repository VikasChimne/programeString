package programeString;

public class TestSplitMethod
{
    public static void main(String[] a)
    {
       String str ="Converting string to string array";
       String[] strArray=null;
       strArray=str.split(" ");
      for(int i=0;i<strArray.length;i++)
       {
         System.out.println(strArray[i]);
       }
    }
}

