import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        while (n > 0) {
            if (isPrime(n)) {
                n--;
            } else {
                int gpd = findGPD(n);
                n = gpd; 
            }
            count++;
        }
        System.out.println(count);
    }
    public static int findGPD(int n) 
    {
        for (int i = n/2; i>1; i--) {
            if (n % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return 1;
    }
    public static boolean isPrime(int n)
    {
        for (int i = n/2; i>1; i--) {
            if (n % i == 0)
                return false;
        }
        return true;
    }  
}
