import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<(r+c-1); i++)
        {
            for(int j=0; j<r; j++)
            {
                for(int k=0; k<c; k++)
                {
                    if(k+j==i)
                    {
                        if(i%2==0)
                            System.out.print(arr[k][j] + " ");
                        else 
                            System.out.print(arr[j][k] + " ");
                    }
                }
                System.out.print("");
            }
        }
    }
}
