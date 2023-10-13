import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "house no : 123@ cbe";
        char ch[] = str.toCharArray();
        System.out.println(str + "\n");
        int i=0, j=ch.length-1;
        while(i<j)
        {
            while(i<j && ((ch[i]>=32 && ch[i]<=47)|| (ch[i]>=58 && ch[i]<=64) || (ch[i]>=91 && ch[i]<=96) || (ch[i]>=123 && ch[i]<=126)))
                i++;
            while(i<j && ((ch[j]>=32 && ch[j]<=47)|| (ch[j]>=58 && ch[j]<=64) || (ch[j]>=91 && ch[j]<=96) || (ch[j]>=123 && ch[j]<=126)))
                j--;
                
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        
        // In above condition I have taken all the possible special characters 
        // that is from 32->47, 58->64, 91->96, 123->126.
        
        for(char c : ch)
            System.out.print(c + "");
    }
}
