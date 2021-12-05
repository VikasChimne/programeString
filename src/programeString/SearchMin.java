package programeString;

public class SearchMin
{
	public static void main(String[] args)
		{
		  int[] a = {4,3,5,2,22,9,6};  
		  //OR   int[] a = new int[] {4,3,5,2,1,6};Declaration,Creation,Initialization
	      int min=a[0];
	      for(int i=1;i<a.length;i++)
	      {
	    	  if(min>a[i])
	    	  {
	    		  min=a[i];
	    	  }
	      }
	      System.out.println("Maximum Element is:"+min);
		}

	}


