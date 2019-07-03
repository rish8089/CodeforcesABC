package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClocksEverywhere {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] str = br.readLine().split(" ");
        long[] x = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(str[i]);
        }

        str = br.readLine().split(" ");
        long[] p = new long[m];

        for (int i = 0; i < m; i++) {
            p[i] = Long.parseLong(str[i]);
        }

        long greatestCommonDivisor = x[1] - x[0];
        for (int i = 2; i < n; i++) {
            greatestCommonDivisor = gcd(greatestCommonDivisor, x[i] - x[i - 1]);
        }

        for (int i=0;i<m;i++){
            if(greatestCommonDivisor%p[i]==0)
            {
                System.out.println("YES");
                System.out.println(x[0]+" "+(i+1));
                return;
            }
        }

        System.out.println("NO");


    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


}
