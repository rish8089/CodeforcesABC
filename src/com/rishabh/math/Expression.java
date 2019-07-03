/*
https://codeforces.com/problemset/problem/479/A
 */

/**
 * Algorithm
 *
 * Here we have three numbers a,b,c in order. We need to place *,+,(,) so that we get the maximum
 * value of expression.
 * Suppose if if a==1 && c==1 then answer a+b+c, else if a==1 then (a+b)*c, else if (c==1) then
 * a*(b+c) else [ if(b==1) ans=max(a*(b+c),(a+b)*c) else ans = a*b*c ]
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expression {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 1 && c == 1) {
            System.out.println(a + b + c);
        } else if (a == 1) {
            System.out.println((a + b) * c);
        } else if (c == 1) {
            System.out.println(a * (b + c));
        } else {
            if (b == 1) {
                System.out.println(max(a * (b + c), (a + b) * c));
            } else {
                System.out.println(a * b * c);
            }
        }

    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }


}
