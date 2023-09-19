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
        
        for(int i=0; i<r; i++)
        {
                if(i%2==0)
                {
                    for(int k=0; k<r; k++)
                    {
                        System.out.print(arr[i][k] + " ");
                    }
                }
                else 
                {
                    for(int l=r-1; l>=0; l--)
                    {
                        System.out.print(arr[i][l] + " ");
                    }
                }
                
            System.out.println();
        }
        
    }
}
