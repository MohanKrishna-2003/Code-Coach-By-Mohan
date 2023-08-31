import java.util.*;
public class Main 
{
    public static void main (String[] args) 
    {
        int mat[][] = {{1, 0, 0, 1, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 0, 1}, {1, 1, 0, 1, 0}};
        int m = mat.length;
        int n = mat[0].length;
        int res[][] = new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)   
            {
                res[i][j] = mat[i][j];
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(mat[i][j]==1)
                {
                    // for a row 
                    // 1. up 
                    if(i-1>=0)
                        res[i-1][j] = 0;
                        
                    // 2. down 
                    if(i+1<m)
                        res[i+1][j] = 0;
                        
                    // for a column
                    // 1. left
                    if(j-1>=0)
                        res[i][j-1] = 0;
                    
                    // 2. right
                    if(j+1<n)
                        res[i][j+1] = 0;
                }
            }
        }
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(res[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
