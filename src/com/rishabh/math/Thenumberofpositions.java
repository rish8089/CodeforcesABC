/*
https://codeforces.com/problemset/problem/124/A
 */

/**
 * It is given that a person can stand at multiple positions, but there are following rules:-
 * 1) atleast a people should stand in front of him.
 * 2) atmost b people can stand after him.
 *
 * There are total of n people, we have to calculate no of possible positions.
 *
 * So its simple, if(n-b<=a+1) then n-(a+1)+1=n-a positions
 * else n-(n-b)+1=b+1
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thenumberofpositions {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[]=br.readLine().split(" ");

        int n=Integer.parseInt(str[0]);
        int a=Integer.parseInt(str[1]);
        int b=Integer.parseInt(str[2]);

        if (n - b <= a + 1) {
            System.out.println(n-a);
        }
        else{
            System.out.println(b+1);
        }

    }

}
