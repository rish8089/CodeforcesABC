package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JzzhuAndSequences {

    private static long mod = 1000000007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String f1f2[] = br.readLine().split(" ");
        int f1 = Integer.parseInt(f1f2[0]);
        int f2 = Integer.parseInt(f1f2[1]);

        int n = Integer.parseInt(br.readLine());
        long ans;

        if (n % 3 == 0) {
            if (n % 2 == 0) {
                long modMultiple = (f1 - f2) / mod;
                modMultiple = modMultiple < 0 ? -modMultiple : modMultiple;
                modMultiple += (f1 - f2) % mod !=0 ? 1 : 0;
                ans = (f1 - f2 + modMultiple * mod) % mod;
            } else {
                long modMultiple = (f2 - f1) / mod;
                modMultiple = modMultiple < 0 ? -modMultiple : modMultiple;
                modMultiple += (f2 - f1) % mod != 0 ? 1 : 0;
                ans = (f2 - f1 + modMultiple * mod) % mod;
            }
        } else {
            if (n % 3 == 1) {
                if (n % 2 == 0) {
                    ans = (-f1 + mod) % mod;
                } else {
                    ans = (f1 + mod) % mod;
                }
            } else {
                if (n % 2 == 0) {
                    ans = (f2 + mod) % mod;
                } else {
                    ans = (-f2 + mod) % mod;
                }
            }
        }

        System.out.println(ans);

    }

}
