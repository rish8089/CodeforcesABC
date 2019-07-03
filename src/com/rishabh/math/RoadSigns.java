package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadSigns {

    private static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int k = Integer.parseInt(br.readLine());
            if (k == 1) {
                System.out.println(10);
            } else {
                System.out.println((mypow(2, k)*5) % mod);
            }
            t--;
        }
    }

    private static long mypow(long a, int b) {
        long res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res = res * a;
                if (res >= mod) {
                    res = res % mod;
                }
            }

            b = b / 2;
            if (b > 0) {
                a = a * a;
                if (a >= mod) {
                    a = a % mod;
                }
            }
        }

        return res;
    }

}
