/*
The program must accept an integer matrix of size N*N as input. The program must interchange the values in the diagonals of the matrix. Finally, the program prints
the matrix.
Boundary Condition(s):
1 <= N <= 50
Input Format:
The first line contains the value of N.
The next N lines contain N integers each separated by space(s).
Output Format:
The first N lines contain N integers each separated by a space.
Example Input/Output 1:
Input:
3
516
429
873
Output:
615
429
378
Explanation:
The main diagonal elements are 5 2 3
The opposite diagonal elements are 6 28
In the 1st row, interchange 5 and 6
In the 2nd row, 2 is common for both the diagonals. Hence no need to interchange.
In the 3rd row, interchange 8 and 3
Example Input/Output 2:
Input:
4
54 86 35 71
78 32 85 62
69 84 66 45
37 79 73 30
Output:
71 86 35 54
78 85 32 62
69 66 84 45
30 79 73 37

*/

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[][] = new int[N][N];
		for(int i=0; i<N; i++){
		    for(int j=0; j<N; j++){
		        a[i][j] = sc.nextInt();
		    }
		}
		
		for(int i=0; i<N; i++){
		    int temp = a[i][i];
		    int u = a[i][i] = a[i][N-i-1];
		    int l = a[i][N-i-1] = temp;
		    
		}
		
		for(int i=0; i<N; i++){
		    for(int j=0; j<N; j++){
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.println("");
		}
	}
}
