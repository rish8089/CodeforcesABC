package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VanyaAndBooks {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int x = (int) Math.log10(n + 1);

        long ans = 0;
        long prod = 9;

        for (int i = 1; i <= x; i++) {
            ans += prod * i;
            prod *= 10;
        }

        int rem = n - (int) Math.pow(10, x) + 1;
        ans += (long)(x + 1) * rem;

        System.out.println(ans);


    }

}
