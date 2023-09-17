import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {18, 18, 19, 19, 2, 3, 19, 19};    
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            boolean flag = false;
            while(i<n-1 && arr[i]==arr[i+1])
            {
                flag = true;
                i++;
            }
            if(flag)
                System.out.print(arr[i] + " ");
        }
        
    }
}
