/*
https://codeforces.com/problemset/problem/766/B
 */

/**
 * Algorithm:- This is a good question, here we have to find a,b,c such that a+b>c, a+c>b, b+c>a
 * (basic properties of a triangle). So first we sort the array, so that we can apply some logic.
 *
 * Now if we take first two numbers, we need to find such a number which is greater the sum of other
 * two numbers. So if third number is taken, if its not lesser than sum  of first two numbers, then
 * no need to go forward.
 *
 * Now take 2nd and 3rd number, if 4th number is not greater than sum of 2nd and 3rd number, then
 * take 3rd and 4th number and this continues.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MahmoudAndATriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];

        String str[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(a, 0, n);

        for (int i = 0; i < n - 2; i++) {
            if (a[i] + a[i + 1] > a[i + 2]) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
