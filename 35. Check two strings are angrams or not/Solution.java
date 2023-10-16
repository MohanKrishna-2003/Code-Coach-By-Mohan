import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str1 = "Silent";
        String str2 = "Listen";
        
        if(checkAnagrams(str1, str2))
            System.out.println("The given strings are anagrams");
        else 
            System.out.println("The given strings are not anagrams");
        
        
    }
    
    public static boolean checkAnagrams(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            System.out.println("");
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        int charCount[] = new int[26];
        
        for(char c : str1.toCharArray())
        {
            charCount[c-'a']++;
        }
        for(char c : str2.toCharArray())
        {
            charCount[c-'a']--;
        }
        
        for(int count : charCount)
        {
            if(count!=0)
                return false;
        }
        return true;
        
    }
}
