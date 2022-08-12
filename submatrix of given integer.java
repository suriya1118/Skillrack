/*------------------------------------------------------------------------------------------------------
A matrix of size R*C and an integer S are passed as the input to the program. The program must print the
2*2 submatrix whose sum is S. If more than one such submatrices exist, print the first occurring submatrix
(when traversed from top to bottom in the matrix and from left to right in each row).
Boundary Condition(s):
2 <= R, C <= 100
Input Format:
The first line contains the value of R and C separated by space(s).
The next R lines contain C integers separated by space(s).
Output Format:
The first two lines contain the submatrix.
Example Input/Output 1:
Input:
33
23 12 45
25 26 29
33 35 36
119
Output:
25 26
33 35
Example Input/Output 2:
Input:
43
48 10 77
4 99 15
75 29 97
40 84 62
272
Output:
29 97
84 62
------------------------------------------------------------------------------------------------------*/
Umi, [8/12/2022 12:12 PM]
import java.util.*;
    public class Main
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int i,j;
            System.out.println("enter row");
            int R=sc.nextInt();
            int C=sc.nextInt();
            int[][] a=new int[R][C];
            for(i=0;i<R;i++)
            {
                for(j=0;j<C;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("enter integer");
            int S=sc.nextInt();
            out:
            for(i=0;i<R-1;i++)
            {
                for(j=0;j<C-1;j++)
                {
                    if((a[i][j]+a[i][j+1]+a[i+1][j]+a[i+1][j+1])==S)
                    {
                        System.out.print(a[i][j]+" "+a[i][j+1]);
                        System.out.println("");
                        System.out.print(a[i+1][j]+" "+a[i+1][j+1]);
                    
                        break out;
                
                    }
                }
                
            }
            
        }
    }
