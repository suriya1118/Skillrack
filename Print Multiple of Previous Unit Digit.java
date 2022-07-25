/* The program must accept N integers as input. The program must print the N
integers multiplied by the unit digit of previous integer. The first integer
has no previous integer, so it is multiplied by the unit digit of Nth integer.
Boundary Condition(s):
2 <= N <= 100
Input Format:
The first line contains the N.
The second line contains the N integers separated by space(s).
Output Format:
The first line contains the N integers.
Example Input/Output 1:
Input:
5
12 34 11 15 16
Output:
72 68 44 15 80 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] J = new int[N];
		int[] R = new int[N];
		int[] A = new int[N];
		for(int i=0; i<N; i++){
		    J[i] = sc.nextInt();
		    R[i] = J[i]%10;
		}
		for(int i=0; i<N; i++){
		    if(i==0){
		        A[i] = J[i] * R[N-1];
		    }
		    else{
		        A[i] = J[i] * R[i-1];
		    }
		    System.out.print(A[i] + " ");
		}
	}
}
