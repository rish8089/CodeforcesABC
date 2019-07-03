/*
https://codeforces.com/problemset/problem/318/A
 */

/**
 * Algorithm:
 *
 * No of odd numbers from 1 to n : n-n/2 So if k>n-n/2, number we want is even, so it will be
 * (k-n-n/2)th even number.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdds {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk[]=br.readLine().split(" ");
        Long n = Long.parseLong(nk[0]);
        Long k = Long.parseLong(nk[1]);

        if (k > n - n / 2) {
            System.out.println(2 * (k - n + n / 2));
        } else {
            System.out.println(1 + (k - 1) * 2);
        }
    }

}
