import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "deeiefabi";
        String res = "";
        int count[] = new int[26];
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0; i<26; i++)
        {
            if(count[i]>0)
            {
                for(int j=0; j<count[i]; j++)
                {
                    res += (char)(i+97);
                }
            }
        }
        System.out.println(res);
    }
}
