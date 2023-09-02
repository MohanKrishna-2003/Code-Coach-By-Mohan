import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String Version1 = "4.8.2";
        String Version2 = "4.8.4";
        
        String[] v1 = Version1.split("\\.");  // 4 8 2
        String[] v2 = Version2.split("\\.");  // 4 8 4
        
        int maxLength = Math.max(v1.length, v2.length);
        for(int i=0; i<maxLength; i++)
        {
            int num1 = (i<v1.length) ? Integer.parseInt(v1[i]) : 0;
            int num2 = (i<v2.length) ? Integer.parseInt(v2[i]) : 0;
            if(num1<num2)
                System.out.println("Upgraded");
            else if(num1>num2)
                System.out.println("Downgraded");
        }
    }
}


