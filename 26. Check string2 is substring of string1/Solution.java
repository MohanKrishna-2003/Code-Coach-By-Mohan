import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str1 = "Mohankrishna";
        String str2 = "ris";
        int ind = -1;
        boolean flag = false;
        for(int i=0; i<str1.length(); i++)
        {
            ind = i;
            if(str1.charAt(i)==str2.charAt(0))
            {
                for(int j=0; j<str2.length(); j++)
                {
                    if(str2.charAt(j)==str1.charAt(ind))
                    {
                        ind++;
                        flag = true;
                    }
                    else 
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    System.out.println(i+1);
            }
        }
        if(flag==false)
            System.out.println(-1);
    }
}
