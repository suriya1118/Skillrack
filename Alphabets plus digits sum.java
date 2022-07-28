/*
The program must accept a string S which has alphabets and digits as the
input. The program must find the sum of all the digits as D. Then the
program must print the alphabets which are D positions from the alphabets
present in the string.
Note:
The output must be in lowercase.
Boundary Condition(s):
Length of the S is from 3 to 100.
Input Format:
The first line contains the string S.
Output Format:
The first line contains the modified alphabets.
Example Input/Output 1:
Input:
435acl
Output:
mox
Explanation:
The digits are 4, 3, 5. The sum = 4 + 3 + 5 = 12.
The alphabets are a, c, l. So a + 12 = m, c + 12 = o, I + 12 = x.
*/
//Refer ASCII table or better understanding
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int D=0;
		char[] a = new char[S.length()];
		for(int i=0; i<S.length(); i++){
		    if(S.charAt(i)>='0' && S.charAt(i)<='9'){
		        D = D + (((int)S.charAt(i)) - 48);
		    }
		   /* if(S.charAt(i)>='0' && S.charAt(i)<='9'){
		        D = D+(Character.getNumericValue(S.charAt(i)));
		    } */
		}
		for(int i=0; i<S.length(); i++){
		    int ans;
		    if(S.charAt(i)>='a' && S.charAt(i)<='z'){
		        ans = (((int)S.charAt(i)) + D);
		        while(ans>122){
		            ans = ans - 26;
		        }
		        System.out.print((char)ans);
		    }
		    else if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
		        ans = (S.charAt(i) + D + 32);
		        while(ans>122){
		            ans = ans - 26;
		        }
		        System.out.print((char)ans);
		    }
		    else{
		        continue;
		    }
		}
	}
}
