package programeString;

public class Test
{
  public static void main(String[] b)
   {
       int[] a = {8,5,7,9,3,2};
       int temp;
       for(int i=0;i<a.length;i++)
      {
         for(int j=i+1;j<a.length;j++)
         {
            if(a[i]<a[j])
            {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
         }
      }
     for(int i=0;i<a.length;i++)
     {
      System.out.println(a[i]+" ");
     }
      System.out.println("Second Largest no:"+a[1]);
     }
}
