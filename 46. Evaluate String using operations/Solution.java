import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "67542-/+-";
        int firstOperator = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!(ch>=48 && ch<=57))
            {
                firstOperator = i;
                break;
            }
        }
        
        int res = str.charAt(0);
        int operatorCount = firstOperator;
        for(int i=1; i<firstOperator; i++)
        {
            char ch = str.charAt(operatorCount);
            if(ch=='+')
                res += str.charAt(i);
            else if(ch=='-')
                res -= str.charAt(i);
            else if(ch=='*')
                res *= str.charAt(i);
            else if(ch=='/')
                res /= str.charAt(i);
            else 
                res %= str.charAt(i);
            operatorCount++;
        }
        System.out.println(res);
    }
}
