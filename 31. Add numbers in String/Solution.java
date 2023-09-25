import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "1ab40b3";
        int sum = 0;
        String tempStr = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9')
                tempStr += ch;
            else 
            {
                sum += convertToInt(tempStr);
                tempStr = "0";
            }
        }
        sum += convertToInt(tempStr);
        System.out.println(sum);
    }
    
    public static int convertToInt(String str)
    {
        int res = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            res = (res*10)+ (ch-48);
        }
        return res;
    }
}
