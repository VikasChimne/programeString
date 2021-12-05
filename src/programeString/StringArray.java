package programeString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 public class StringArray
{
public static void main(String[] a)
{
String[] sa={"A","B","C","D"};
System.out.println("Initial Array:\n"+Arrays.toString(sa));
String ne="E";
List<String>list=new ArrayList<String>(Arrays.asList(sa));
list.add(ne);
sa=list.toArray(sa);
System.out.println("Array with added Value:\n"+Arrays.toString(sa));
}
}
