import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "what is your name ?";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!isVowel(ch))
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
    
    public static boolean isVowel(char ch)
    {
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}
