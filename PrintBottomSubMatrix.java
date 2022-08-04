/*
Accept an integer matrix of size N*N. The program must print the bottom right quadrant in the matrix as the output.
Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains the integer value of N.
The next N lines contain N integers separated by space(s).
Output Format:
The list of lines contain the bottom right quadrant integers each separated by space.
Example Input/Output 1:
Input:
4
1209
8342
1016
5629
Output:
16
29
Example Input/Output 2:
Input:
3
124
9821
0112
Output:
821
112
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N];
		for(int i=0; i<N; i++){
		    for(int j=0; j<N; j++){
		        a[i][j] = sc.nextInt();
		    }
		    System.out.println("");
		}
		
		for(int i=0; i<N; i++){
		    for(int j=0; j<N; j++){
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println("");
		}
		
		for(int i=0; i<N; i++){
		    for(int j=0; j<N; j++){
		        if((i==N-1 && j==(N-1)) || (i==(N-1) && j==(N-2)) || (i==(N-2) && j==(N-1)) || (i==(N-2) && j==(N-2))){
		            System.out.print(a[i][j] + " ");
		        }
		    }
		    System.out.println("");
		}
		
	}
}
