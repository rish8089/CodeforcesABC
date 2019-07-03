/*
https://codeforces.com/problemset/problem/50/A
 */

/**
 * Algorithm
 *
 * Here we have a rectangular board of size MxN squares, we have to place dominos of size 2x1 (can
 * be rotated) within the rectangular board. We need to put as many as dominos possible within
 * rectangular board. If M is even, we would place dominos in 2x1 orientation all over the board and
 * they will cover the board completely. Max no of dominos can be placed in this case=N*(M/2). If N
 * is even, we would place dominos in 1x2 orientation all over the board and they will cover the
 * board completely. Max no of dominos can be placed in this case=(N/2)*M
 *
 * So if any of them is even, so ans is (N*M)/2
 *
 * Lets see whats happens in case if both are odd. (M-1) would be even, so for the M-1 rows, max no
 * of dominos can be placed = (M-1)*N/2 In last row we can place dominos in 1x2 orientation , so max
 * no of dominos can be placed = N/2
 *
 * so max no of dominos which can be placed = (N/2)*(M-1+1)=(N*M)/2
 *
 * So irrespective of anything, our ans will be (N*M)/2.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DominoPiling {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        System.out.println((m * n) / 2);

    }

}
