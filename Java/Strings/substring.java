/*
Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

In the diagram below, the substring is highlighted in green:

substring.png


*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in=new Scanner (System.in);
         String a= in.nextLine();
         String b= in.nextLine();
         String[] parts=b.split(" ");
         int c= Integer.parseInt(parts[0]);
         int d= Integer.parseInt(parts[1]);
         System.out.println(a.substring(c,d));
    }
}



