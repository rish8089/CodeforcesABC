/*
https://codeforces.com/problemset/problem/478/B
 */

/**
 * Here we have to find minimum sum of total friend pairs and maximum sum of total friend pairs if n
 * players are divied into m teams. Maximum is easy, as m<=n, put 1 player in every team and then add
 * all remaining players in a single team. So sum of friend pairs in such case will be (n-m+1)C2
 *
 * Minimum is easy, logic is to distribute equally first and then add remaining players one by one
 * into as many teams as possible.
 * So sum of friend pairs will be (m-n%m)*(n/m)C2+(n%m)*(n/m+(n%m?1:0))C2
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomTeams {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[] = br.readLine().split(" ");
        long n = Long.parseLong(nm[0]);
        long m = Long.parseLong(nm[1]);

        long kmin = (m - n%m) * (n / m) * (n / m - 1) / 2
            + (n%m)*(n / m + (n % m > 0 ? 1 : 0)) * (n / m + (n % m > 0 ? 1 : 0) - 1) / 2;
        long kmax = (n - m + 1) * (n - m) / 2;

        System.out.println(kmin + " " + kmax);


    }

}
