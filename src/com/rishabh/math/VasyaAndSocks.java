/*
https://codeforces.com/problemset/problem/460/A
 */

/**
 * Algorithm
 *
 * Suppose we have n socks, first she should have socks for m days, then (m+1)th day she will have
 * new sock , then for next m-1 days, she should have m-1 socks, (2m+1)th day she will have new
 * sock,----------- and this continues.
 *
 * So first check if n<m, then we can have socks for only n days else we will have socks for atleast
 * m+1 days, socks remaining after that will be (n-m). Now we have to count for how many (m-1) days,
 * socks will continue, it will be (n-m)/(m-1), so no of days socks will continue= (m+1) +
 * m*(n-m)/(m-1)+(n-m)%(m-1)
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VasyaAndSocks {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm[] = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        if (n < m) {
            System.out.println(n);
        } else {
            //socks will continue for atleast (m+1) days
            System.out.println((m + 1) + m * ((n - m) / (m - 1)) + (n - m) % (m - 1));
        }

    }

}
