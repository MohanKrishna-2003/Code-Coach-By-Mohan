import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "MoHaN KrIsHnA";
        char ch[] = new char[str.length()];
        char ch2[] = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            char character = str.charAt(i);
            if(character>=65 && character<=90)
            {
                ch[i] = (char)((character-65)+97);
            }
            else 
            {
                ch[i] = character;
            }
        }
         for(int i=0; i<str.length(); i++)
        {
            char character = str.charAt(i);
            if(character>=97 && character<=122)
            {
                ch2[i] = (char)((character-97)+65);
            }
            else 
            {
                ch2[i] = character;
            }
        }
        System.out.println(ch);
        System.out.println(ch2);
    }
}
