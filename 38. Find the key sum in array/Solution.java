import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[] = {1, 3, 4, 8, 10};
        int n = arr.length;
        int key = 12;
        if(isFoundTarge8t(arr, n, key))
            System.out.println("Found the key sum in array");
        else 
            System.out.println("Does not found the key sum in array");
    }
    
    public static boolean isFoundTarge8t(int[] arr, int n, int key)
    {
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            int currentSum = arr[left] + arr[right];
            if(currentSum==key)
                return true;
            else if(currentSum<key)
                left++;
            else 
                right--;
        }
        return false;
    }
}
