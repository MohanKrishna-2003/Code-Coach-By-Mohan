import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int a=11, b=342, c=1111;
        int max = a;
        if(max<b)
            max = b;
        if(max<c)
            max = c;
        System.out.println(max);
    }
}
