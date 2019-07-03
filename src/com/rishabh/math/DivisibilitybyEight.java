/*
https://codeforces.com/problemset/problem/550/C
 */

/**
 * Algorithm:
 *
 * Divisibility by 8 rule : last three digits should be divisible by 8
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibilitybyEight {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i <= 1000; i += 8) {
            int temp = i;
            int cnt=0;
            int currDigit = temp % 10;
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) - '0' == currDigit) {
                    temp = temp / 10;
                    currDigit = temp % 10;
                    cnt+=1;
                }
            }

            if(temp==0 && cnt>0)
            {
                System.out.println("YES");
                System.out.println(i);
                return;
            }
        }

        System.out.println("NO");
    }
}
