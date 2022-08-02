/*
Accept a list of M and N integers as the input. The program must print the common unique
integers between the two lists M and N in the order given in M. If there is no common unique
integer then the program must print "Invalid" as the output.
Boundary Condition(s):
1 <= M <= 50
0 <= N <= M
0 <= Values of integers <= 999
Input Format:
The first line contains the value of M and N separated by space(s).
The second line contains M integers separated by space(s).
The third line contains N integers separated by space(s).
Output Format:
The first line contains the common unique integers separated by space or "Invalid".
Example Input/Output 1:
Input:
73
3571628
127
Output:
712
Example Input/Output 2:
Input:
44
3410
0119
Output:
10
*/

import java.util.*;
public class CommonIntegerBetweenTwoArray {

    public static void main(String[] args) {
		//Your Code Here
  Scanner s=new Scanner(System.in); 
  
  int n=s.nextInt(),m=s.nextInt(); 
  
  int[] arr=new int[n]; 
  
  for(int i=0;i<n;i++) 
  arr[i]=s.nextInt(); 
  
  Set<Integer> set=new HashSet<>(); 
  
  while(s.hasNextInt()) 
  set.add(s.nextInt());
  
  boolean flag=false; 
  
  for(int i=0;i<n;i++){ 
      
    if(set.contains(arr[i])){ 
    System.out.print(arr[i]+" "); 
    set.remove(arr[i]);
    flag=true; 
    
    }
    
  }
  
  if(!flag) 
  System.out.println("Invalid");
  
  

	}
}
