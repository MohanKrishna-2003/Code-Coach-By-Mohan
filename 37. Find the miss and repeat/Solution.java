import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {3, 2, 3};
        int n = arr.length;
        int repeat = 0;
        int count[] = new int[n];
        for(int i : count)
            i = 0;
        for(int i=0; i<n; i++)
        {
            if(count[arr[i]-1]==1)
                repeat = arr[i];
            count[arr[i]-1] = 1;
        }
        for(int i : count)
            System.out.print(i + " ");
            
        System.out.println();
        for(int i=0; i<n; i++)
        {
            if(count[i]==0)
            {
                System.out.println(i+1);
                break;
            }
        }
        System.out.println(repeat);
    }
}
