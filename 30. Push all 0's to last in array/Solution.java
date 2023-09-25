import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {1, 2, 0, 0, 4, 0, 9, 1, 0};
        int n = arr.length;
        int i=0, j=n-1;
        while(i<j)
        {
            if(arr[i]!=0)
                i++;
            else if(arr[j]==0)
                j--;
            else 
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        
    }
}
