package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuffInLove {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long ans = 1;

        for (long i = 2; i * i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                n = n / i;
                cnt += 1;
            }

            if (cnt > 0) {
                ans = ans * i;
            }
        }

        if (n > 0) {
            ans = ans * n;
        }

        System.out.println(ans);


    }

}
