/*
 * https://codeforces.com/problemset/problem/1/A
 */

/**
 * Algorithm
 *
 * Theatre square is of width m and length n. We need to cover it entirely with flagstones. In order
 * to cover the entire width we would need ceil(m/a) stones along width and to cover the entire
 * length we would need ceil(n/a) stones along length.
 *
 * Total no of stones required= no of stones required along width * no of stones required along
 * length
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatreSquare {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);

        System.out.println((long) ceil(n, a) * ceil(m, a));

    }

    private static int ceil(int n, int a) {
        return n % a > 0 ? n / a + 1 : n / a;
    }

}
