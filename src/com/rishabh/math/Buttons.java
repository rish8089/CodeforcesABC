/*
https://codeforces.com/problemset/problem/268/B
 */
/**
 * n is the no of buttons.
 * Guessing the first button, can take n pushes. 1*(n-1)+1
 * Guessing the second button, would take 2*(n-2)+1
 * Guessing the third button , would take 3*(n-3)+1
 *
 * Sum all these for n buttons=n+n(1+2+3----n)-(1+4+9----n^2)
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buttons {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());

        System.out.println(n+n*n*(n+1)/2-n*(n+1)*(2*n+1)/6);
    }

}
