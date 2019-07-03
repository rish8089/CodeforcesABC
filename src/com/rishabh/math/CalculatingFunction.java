/*
https://codeforces.com/problemset/problem/486/A
 */

/**
 * Algorithm
 *
 * f(n) =  - 1 + 2 - 3 + .. + ( - 1)^n*n
 *
 * adjacent numbers gets evaluated to 1, so in case when n is even answer will be n/2
 * else if n is odd, then n/2-n.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatingFunction {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());

        System.out.println(n%2==0?n/2:n/2-n);

    }

}
