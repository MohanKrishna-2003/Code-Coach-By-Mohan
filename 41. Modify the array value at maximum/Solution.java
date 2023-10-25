import java.util.*;
public class Main 
{
    
    public static void main (String[] args) 
    {
        int arr[] = {120, 24, 71, 10, 59};
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = getMaxValue(arr[i]);
        }
        for(int i : arr)
            System.out.print(i + " ");
    }
    
     public static int getMaxValue(int n)
    {
        int max1 = getMul(n);
        int max2 = getSum(n);
        return Math.max(max1, max2);
    }
    
    public static int getMul(int n)
    {
        int mul = 1;
        while(n>0)
        {
            int rem = n%10;
            mul *= rem;
            n/=10;
        }
        return mul;
    }
    
    public static int getSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum += rem;
            n/=10;
        }
        return sum;
    }
}
