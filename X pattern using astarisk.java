/*
Accept a number N as the input. The program must print the X pattern as shown in the Example
Input/Output Section as the output. (Note: Spaces should be replaced with asterisk)
Boundary Condition(s):
2 <= N <= 50
Input Format:
The first line contains the value of N.
Output Format:
The list of lines contain the desired pattern.
Example Input/Output 1:
Input:
4
Output:
1*****1
*2***2*
**3*3**
***4***
**3*3**
*2***2*
1*****1
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = (N+(N-1));
		for(int i=0; i<R; i++){
		    for(int j=0; j<R; j++){
		        if(i==j && (i<R/2 && j<R/2) || (i+j)==(R-1) && (i<R/2)){
		        System.out.print(i+1);
		        }
		        else if((i+j)==(R-1) && (i>R/2)){
		        System.out.print(j+1);    
		        }
		        else if(i==j && (j>R/2)){
		        System.out.print(-(j-R));
		        }
		        else if(i==j){
		            System.out.print(N);
		        }
		        else{
		          System.out.print("*");  
		        }
		    }
		    System.out.println("");
		}
	}
}

