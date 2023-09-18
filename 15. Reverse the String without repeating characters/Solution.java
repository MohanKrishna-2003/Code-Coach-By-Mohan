import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "widsom overflow";
        StringBuffer sb = new StringBuffer();
        boolean visited[] = new boolean[256];
        char ch[] = str.toCharArray();
        for(int i=ch.length-1; i>=0; i-- )
        {
            char currentChar = ch[i];
            if(!visited[currentChar])
            {
                sb.append(currentChar);
                visited[currentChar] = true;
            }
        }
        System.out.println(sb.toString().replaceAll(" ", ""));
    }
}
