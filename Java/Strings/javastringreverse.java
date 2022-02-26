/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        String str= in.nextLine();
        
        String a="0";
        int mid=str.length()/2;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
               a="Yes";
            }else{a="No";}
        }
        System.out.println(a);
    }
    
}

