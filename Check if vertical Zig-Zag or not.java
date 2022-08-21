/*
The program must accept an integer matrix with size NxN as input. The program must print "Yes"
if the given matrix is vertically zig-zag. Else the program must print "No" as the output.
Note: The matrix must be filled with first N*N natural numbers starting from 1 in vertical zig-zag
fashion.
Boundary Condition(s):
1 <= N <= 50
0 <= Matrix Elements <= 999
Input Format:
The first line contains the value of N.
The next N lines contain N integers separated by space(s).
Output Format:
The first line contains either "Yes" or "No".
Example Input/Output 1:
Input:
5
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25
Output:
Yes
*/

import java.util.*;public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][n];
	for(int i=0;i<n;++i){
	    for(int j=0;j<n;++j)arr[i][j]=sc.nextInt();
	}
	int count=1;
	for(int j=0;j<n;++j ){
	    if(j%2==0){
	    for(int i=0;i<n;++i)if(arr[i][j]!=count++){
	        System.out.println("No");
	        return;
	    }
	    }
	    else{
	        for(int i=n-1;i>=0;--i){
	            if(arr[i][j]!=count++){
	                System.out.println("No");
	                return;
	            }
	        }
	    }
	}
	System.out.println("Yes");

	}
}
