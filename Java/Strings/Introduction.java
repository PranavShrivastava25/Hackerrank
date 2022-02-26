/*
"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String A= in.nextLine();
       String B=in.nextLine();
       System.out.println(A.length()+B.length());
       System.out.println(lexico(A,B));
       System.out.println(capital(A,B));
       
    }
    public static String lexico(String A,String B){
        int c=0;
        if(A.length()<B.length()){c=A.length();}
        else{ c=B.length();}
        for(int i=0;i<c;i++){
            if((int)A.charAt(i)>(int)B.charAt(i)){
                return "Yes";
            }else{return "No";}
           
             
        }
        return "-1";
         
        
    }
    public static String capital(String A,String B){
       String a= A.substring(0,1);
       String b= B.substring(0,1);
       return a.toUpperCase()+A.substring(1)+" "+b.toUpperCase()+B.substring(1);
           
       
    }
}
    
        
        
        
        
    
    

