package programeString;

public class SearchMax {

	public static void main(String[] args)
	{
	  int[] a = {4,3,5,2,22,9,6};  
	  //OR   int[] a = new int[] {4,3,5,2,1,6};Declaration,Creation,Initialization
      int max=a[0];
      for(int i=1;i<a.length;i++)
      {
    	  if(max<a[i])
    	  {
    		  max=a[i];
    	  }
      }
      System.out.println("Maximum Element is:"+max);
	}

}
