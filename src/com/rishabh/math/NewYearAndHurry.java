/*
https://codeforces.com/problemset/problem/750/A
 */

/**
 * Algorithm:
 *
 * Total amount of minutes available=4*60 No of minutes he has for doing problems(rem)=4*60-k Keep
 * dividing 5i from rem where i is increasing by 1, until rem>=5i
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearAndHurry {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk[] = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        if (k > 240) {
            System.out.println(0);
        } else {
            int rem=240-k;
            //quadratic equation will be 5n^2+5n-2*rem
            int noOfProblemsCanBeSolved=(int)(-5+Math.sqrt(25+40*rem))/10;
            System.out.println(min(noOfProblemsCanBeSolved,n));
        }
    }

    private static int min(int a,int b)
    {
        if(a<b)
            return a;
        else
            return b;
    }
}
