import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        for(int i=n1-1; i>=0; i--)
        {
            a[i] = sc.nextInt();
        }
        for(int i=n2-1; i>=0; i--)
        {
            b[i] = sc.nextInt();
        }
        int maxSize = Math.max(n1, n2)+1; // for carry we add 1 
        int res[] = new int[maxSize];
        int carry = 0;
        for(int i=0; i<maxSize; i++)
        {
            int val1 = (i<n1)?a[i]:0;
            int val2 = (i<n2)?b[i]:0;
            
            int sum = val1 + val2 + carry;
            res[i] = sum%10;
            carry = sum/10;
        }
        
        boolean isZero = false;
        for(int i=maxSize-1; i>=0; i--)
        {
            if(res[i]!=0)
                isZero = true;
            if(isZero)
                System.out.print(res[i] + " ");
        }
        if(!isZero)
            System.out.print(" 0 ");
        
    }
}
