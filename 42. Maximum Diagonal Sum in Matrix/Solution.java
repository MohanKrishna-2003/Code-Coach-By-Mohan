import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int upperDiagonalSum = 0, lowerDiagonalSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(i<= 3-j-1)
                    upperDiagonalSum += arr[i][j];
                if(i>= 3-j-1)
                    lowerDiagonalSum += arr[i][j];
            }
        }
        System.out.println(Math.max(upperDiagonalSum, lowerDiagonalSum));
    }
}
