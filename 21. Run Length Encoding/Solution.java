import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "a4n8c5d2";
        String res = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                for(int j=0; j<(ch-'0'); j++)
                {
                    res += str.charAt(i-1);
                }
            }
        }        
        System.out.println(res);
    }
}
