import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "XYZ";
        String ans = "";
        printPermutations(str, ans);
    }
    public static void printPermutations(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        else 
        {
            for(int i=0; i<str.length(); i++)
            {
                char ch = str.charAt(i);
                String remainingStr = str.substring(0, i) + str.substring(i+1);
                printPermutations(remainingStr, ans+ch);
            }
        }
    }
}
