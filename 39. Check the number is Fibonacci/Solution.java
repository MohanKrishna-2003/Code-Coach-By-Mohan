import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {1, 10, 6, 8, 13, 21};
        for(int i=0; i<arr.length; i++)
        {
            if(isFibonacci(arr[i]))
                System.out.println(arr[i] + " ");
        }
    }
    
    public static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4);
    }
    
    public static boolean isPerfectSquare(int n)
    {
        int s = getSquareRoot(n);
        return (s*s==n);
    }
    
    public static int getSquareRoot(int n)
    {
        if(n==0 || n==1)
            return n;
        int left = 0, right = n;
        int result = 0;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(mid<=n/mid)
            {
                left = mid + 1;
                result = mid;
            }
            else 
            {
                right = mid - 1;
            }
        }
        return result;
    }
}
