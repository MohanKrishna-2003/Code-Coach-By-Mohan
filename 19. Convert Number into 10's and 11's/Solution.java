import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int num = 32;
        int arr[] = new int[10];
        int count = 0;
        while(num>0)
        {
            int temp = num, mul = 1, hold = 0;
            while(temp>0)
            {
                int rem = temp%10;
                if(rem!=0)
                    hold = hold + mul;
                mul = mul * 10;
                temp /= 10;
            }
            arr[count++] = hold;
            num = num - hold;
        }
        for(int i=0; i<count; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
