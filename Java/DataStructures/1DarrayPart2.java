/*
   THIS QUESTION IS A GOOD QUESTION . HERE IT IS SOLVED USING A SMALL USE OF RECURSION
   
   Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

Move Backward: If cell  exists and contains a , you can walk back to cell .
Move Forward:
If cell  contains a zero, you can walk to cell .
If cell  contains a zero, you can jump to cell .
If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false
Input Format

The first line contains an integer, , denoting the number of queries (i.e., function calls).
The  subsequent lines describe each query over two lines:

The first line contains two space-separated integers describing the respective values of  and .
The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
Constraints

It is guaranteed that the value of  is always .
Sample Input

STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0
Sample Output

YES
YES
NO
NO
Explanation

We perform the following  queries:

For  and , we can walk and/or jump to the end of the array because every cell contains a . Because we can win, we return true.
For  and , we can walk to index  and then jump  units to the end of the array. Because we can win, we return true.
For  and , there is no way for us to get past the three consecutive ones. Because we cannot win, we return false.
For  and , there is no way for us to get past the one at index . Because we cannot win, we return false.
  
  */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int q= in.nextInt();
        for(int i=0;i<q;i++){
            int n=in.nextInt();
            int leap=in.nextInt();
            int[]game=new int[n];
            for(int j=0;j<n;j++){
                game[j]=in.nextInt();
            }
            
            boolean result=canWin(leap,game,0);
            if(result==true){
                System.out.println("YES");
            }else{System.out.println("NO");}
        }
        
       
    }
    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;

        game[i] = 1; //flag

        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
    }
}

