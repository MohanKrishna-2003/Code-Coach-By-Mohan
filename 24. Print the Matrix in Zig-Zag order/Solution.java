import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<(r+c-1); i++)
        {
            for(int row=0; row<r; row++)
            {
                for(int col=0; col<c; col++)
                {
                    if(row+col==i)
                    {
                        if(i%2==0)
                            System.out.print(arr[col][row] + " ");
                        else 
                            System.out.print(arr[row][col] + " ");
                    }
                }
            }
        }
        
    }
}
