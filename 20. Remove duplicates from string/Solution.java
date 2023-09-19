import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "bcabc";
        String res = "";
        for(int i=0; i<str.length(); i++)
        {
            char ch =str.charAt(i);
            int ind = str.indexOf(ch, i+1);
            if(ind==-1)
                res += ch;
        }
        System.out.println(res);
    }
}
