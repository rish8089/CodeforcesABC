/*
https://codeforces.com/problemset/problem/472/A
 */

/**
 * Algorithm
 *
 * Here we need to find a way to express any number >= 12 in the form of two composite numbers.
 * For even numbers, its obvious, we can have 4 and n-4.
 * For odd numbers, we can have 9 and n-9
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignTutorialLearnFromMath {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        if (n % 2 == 0) {
            System.out.println(4+" "+(n-4));
        }
        else{
            System.out.println(9+" "+(n-9));
        }
    }
}
