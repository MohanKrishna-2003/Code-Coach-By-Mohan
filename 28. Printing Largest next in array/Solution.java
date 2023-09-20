import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {16, 17, 4, 3, 5, 2};    
        int max = -1;
        for(int i=arr.length-1; i>=0; i--)
        {
            if(max<arr[i])
            {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
