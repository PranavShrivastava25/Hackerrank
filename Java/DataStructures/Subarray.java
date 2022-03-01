/*
We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of :

Thus, we print  on a new line.
*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[]arr=new int[len];
        for (int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        int count= 0;
        int test=-1000;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int a=0;
                
                for(int k=i;k<=j;k++){
                    a+=arr[k];
                    if (k==j){
                        if(a<0){
                            count=count+1;
                        } 
                }
                
            }
        }
        
    }
    
    System.out.println(count);
}
}

