package programeString;

import java.util.Arrays;
public class SortArray1
{
public static void main(String[] a)
{
 int[] array={90,23,45,12,15,30};
 Arrays.sort(array);
 System.out.println("Elements of array sorted in ascending order:");//+ Arrays.toString(array));
 for(int i=0;i<array.length;i++)
  {
    System.out.println(array[i]);
  }
}
}
