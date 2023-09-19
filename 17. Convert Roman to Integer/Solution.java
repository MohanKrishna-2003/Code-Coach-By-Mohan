import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        String str = "XIV";
        int res = convertRomanToInteger(str);
        System.out.println(res);
    }
    
    public static int convertRomanToInteger(String str)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int res = 0;
        int prev = 0;
        for(int i=str.length()-1; i>=0; i--)
        {
            char curr = str.charAt(i);
            int currValue = hm.get(curr);
            if(currValue<prev)
                res = res - currValue;
            else 
                res = res + currValue;
                
            prev = currValue;
        }
        return res;
    }
}
