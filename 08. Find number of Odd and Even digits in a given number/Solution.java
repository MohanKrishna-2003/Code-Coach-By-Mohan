import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int num = 1234567;
        int evenCount = 0;
        int oddCount = 0;
        while(num>0)
        {
            int digit = num%10;
            if((digit&1)==0)   // here with the help of the '&' operator we find it is even or odd.
                evenCount++;
            else 
                oddCount++;
            num /= 10;
        }
        System.out.println("Even Count:" + evenCount + " Odd Count : " + oddCount);
    }
}
