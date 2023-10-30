import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "hello";
        int count[] = new int[26];
        for(int i=0; i<str.length(); i++)
        {
            int ind = (int)str.charAt(i)-97;
            count[ind]++;
        }
        for(int i=0; i<str.length(); i++)
        {
            int ind = (int)str.charAt(i)-97;
            if(count[ind]==1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
