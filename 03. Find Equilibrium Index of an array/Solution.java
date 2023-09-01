import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
    int n = arr.length;
    if (n == 1)
      System.out.println (0);
    else if (n == 2)
      System.out.println ("No equilibrium index");

    else if (n >= 3)
    {
	    int temp[] = new int[n];
	    int sum = 0;
	    for (int i = 0; i < n; i++)
	    {
	        sum += arr[i];
	        temp[i] = sum;
	    }
	    int leftSum = 0, rightSum = 0, total = sum, ind = -1;
	    boolean flag = false;
	   for (int i = 1; i < n - 1; i++)
	    {
	        leftSum = temp[i] - arr[i];
	        rightSum = total - temp[i];
	        if (leftSum == rightSum)
	        {
		        flag = true;
		        System.out.println (i);
		        break;
	        }
	    }
	    if (!flag)
            System.out.println (ind);
    }
  }
}
