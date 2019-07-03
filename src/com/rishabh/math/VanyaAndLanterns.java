/*
https://codeforces.com/problemset/problem/492/B
 */

/**
 * Algorithm
 *
 * We have to find the minimum radius(d) here. Initialize minimum radius
 * required=max(a[0]-0,l-a[n-1])
 *
 * Look at the adjacent pairs(a,b) and let half of the distance is covered by a and half of the
 * distance is covered by b. minimum radius = max(half of the distance,minimum radius)
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VanyaAndLanterns {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nl[] = br.readLine().split(" ");
        int n = Integer.parseInt(nl[0]);
        int l = Integer.parseInt(nl[1]);

        int a[] = new int[n];
        String str[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(a, 0, n);

        double d = max(a[0], l - a[n - 1]);
        for (int i = 1; i < n; i++) {
            d = max((a[i] - a[i - 1]) / 2.0, d);
        }
        System.out.format("%.9f", d);
    }

    static double max(double a, double b) {
        return a < b ? b : a;
    }

}
