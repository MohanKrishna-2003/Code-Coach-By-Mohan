import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "MohanKrishna";
        char ch[] = str.toCharArray();
        int len = ch.length;
        for(int i=0; i<ch.length/2; i++)
        {
            char temp = ch[i];
            ch[i] = ch[len-i-1];
            ch[len-i-1] = temp;
        }
        System.out.println(String.valueOf(ch));
        
        // here String.valueOf(character array) is used to convert to character array to string.
        
        // for integer array we use Arrays.toString(int array).
        
    }
}
