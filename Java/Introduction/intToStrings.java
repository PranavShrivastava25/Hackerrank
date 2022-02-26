/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.

Sample Input 0

100
Sample Output 0

Good job
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        
        try{
            String b="this is me";
        String c= Integer.toString(n);
            String d= c+b;
            System.out.println("Good job");
        }
        catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}
