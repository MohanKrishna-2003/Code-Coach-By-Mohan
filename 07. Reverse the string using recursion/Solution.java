import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "one two three";
        String res = getReverse(str);
        System.out.println(res);
    }
    public static String getReverse(String str)
    {
        int lastIndex = str.lastIndexOf(' ');  // ' 'three
        if(lastIndex == -1)
            return str;
        String lastWord = str.substring(lastIndex+1);
        String remainingStr = str.substring(0, lastIndex);
        String reverse = lastWord + " " + getReverse(remainingStr);
        return reverse;
    }
}
