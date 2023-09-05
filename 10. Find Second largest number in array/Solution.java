import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {2, 5, 1, 6, 2, 6, 7, 10};    
        System.out.println(getSecondLargest(arr));
      
    }
    public static int getSecondLargest(int arr[])
    {
          if(arr.length==1)
                return arr[0];
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            if(first<=arr[i])
            {
                second = first;
                first = arr[i];
            }
            else if(second<=arr[i] && arr[i]!=first)
                second = arr[i];
        }
        return second;
    }
}
