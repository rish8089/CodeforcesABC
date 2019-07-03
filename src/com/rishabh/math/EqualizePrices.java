package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualizePrices {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        while (q > 0) {
            String nk[] = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String str[] = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                if (max < val) {
                    max = val;
                }
                if (min > val) {
                    min = val;
                }
            }

            if (max - k > min + k) {
                System.out.println(-1);
            } else {
                System.out.println(min+k);
            }

            q--;
        }
    }
}
