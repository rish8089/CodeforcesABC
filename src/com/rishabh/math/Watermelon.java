/*
 * https://codeforces.com/problemset/problem/4/A
 */

/**
 * Algorithm
 *
 * Here the requirement is to divide the watermelon weighing k kilos into two parts weighing
 * positive even. So take 1 part as 2 and other part as k-2, as both parts should be positive even,
 * so k-2>0 and k should be even.
 *
 *
 * Relational operator have greater operator precedence than bitwise operators.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(n == 2 || (n & 1) > 0 ? NO : YES);
    }

}
