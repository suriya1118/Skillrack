//Border and Center Star program

/*
Accept an integer N as the input. The program must print the pattern as
shown in the Example Input/Output section below. (Note:Integer N is always
odd). Asterisk is printed along the border and in the center of the N*N matrix
which is printed as the output.
Boundary Condition(s):
1 <= N <= 25
Input Format:
The first line contains the value of N.
Output Format:
The N lines contain the desired pattern.
Example Input/Output 1:
Input:
5
Ouput:
*123*
*4*6*
*789* 

*/

import java.util.*;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int l=1;
         for(int i=0; i<N; i++){
             for(int j=0; j<N; j++){
                 if(i==0 || j==0 || i==N-1 || j==N-1 ){
                     System.out.print("*");
                 }
                 else if((i==j && i==N/2 && j==N/2)){
                     System.out.print("*");
                     l++;
                 }
                 else{
                     System.out.print(l);
                     l++;
                 }
             }
             System.out.println("");
         }
     }
 }
