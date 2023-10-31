import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "ab C";
        String ans = "";
        int diff;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                if(ch>='a' && ch<='z')
                {
                    diff = (int)ch - 97;
                    ans += (char)(122-diff);
                }
                if(ch>='A' && ch<='Z')
                {
                    diff = (int)ch - 65;
                    ans += (char)(90-diff);
                }
            }
             else 
                {
                    ans += ch;
                }
        }
        System.out.println(ans);
    }
}
