import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        long num = 1234567890;
        long res = sortLongNum(num);
        System.out.println(res);
    }
    
    public static long sortLongNum(long num)
    {
        int count[] = new int[10];
        long res = 0;
        while(num>0)
        {
            int digit = (int)num%10;
            count[digit]++;
            num/=10;
        }
        for(int i=9; i>=0; i--)    
        {
            while(count[i]>0)
            {
                res = (res*10) + i;
                count[i]--;
            }
        }
        return res;
    
    }
}
