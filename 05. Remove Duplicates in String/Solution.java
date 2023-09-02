import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "Java1234";
        String res = removeDuplicates(str);
        System.out.println(res);
    }
    public static String removeDuplicates(String str)
    {
        char[] ch = str.toCharArray();
        boolean seen[] = new boolean[256];
        for(int i=0; i<ch.length; i++)
        {
            char currentChar = ch[i];
            if(seen[currentChar])
            {
                if(Character.isLowerCase(currentChar))
                    ch[i] = 'b';
                else if(Character.isUpperCase(currentChar))
                    ch[i] = 'c';
                else if(Character.isDigit(currentChar))
                {
                    int digit = Character.getNumericValue(currentChar);
                    ch[i] = (char) ('0' + (digit%10) + 1);
                }
            }
            else 
                seen[currentChar] = true;
        }
        return new String(ch);
    }
}
