import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "mohankrishna";
        printAllPalindromicSubStrings(str);
    }
    
    public static void printAllPalindromicSubStrings(String str)
    {
        int n = str.length();
        for(int i=0; i<n; i++)
        {
            for(int j=i+2; j<=n; j++)
            {
                String subStr = str.substring(i, j);
                if(isPalindrome(subStr))
                    System.out.println(subStr);
            }
        }
    }
    
    public static boolean isPalindrome(String str)
    {
        int n = str.length();
        int i = 0;
        int j = n-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
