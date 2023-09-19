import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int n = 165;
        int sum = getSum(n);
        if(sum>9)
        {
            sum = getSum(sum);
        }
        System.out.println(sum);
    }
    
    public static int getSum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}
