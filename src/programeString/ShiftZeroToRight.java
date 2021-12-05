package programeString;

import java.util.Arrays;

public class ShiftZeroToRight 
{
	private static int[] shift(int[] a)
	{
		if(a.length==1)
		{
			return a;
	}
	int newArray[] = new int[a.length];
	int count = 0;
	for (int num : a)
		{
			if(num !=0)
			{
				newArray[count] =num;
				count++;
			}
		}
		return newArray;
	}
    public static void main(String[] args)
    {
    	int[] i = {1,0,2,0,3,0};
    	System.out.println(Arrays.toString(shift(i)));//All Zero Shift to Right Site
    	
    	Arrays.sort(i);
    	System.out.println(Arrays.toString(i));//All Zero Shift to Left Site
    }
}


