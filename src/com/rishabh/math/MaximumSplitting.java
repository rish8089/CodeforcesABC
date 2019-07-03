package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSplitting {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        while (q > 0) {
            int n = Integer.parseInt(br.readLine());

            int k = n / 4;

            switch (n % 4) {
                case 0:
                    System.out.println(k);
                    break;
                case 1:
                    if (k >= 2) {
                        System.out.println(k - 1);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 2:
                    if (k >= 1) {
                        System.out.println(k);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    if (k >= 3) {
                        System.out.println(k - 1);
                    } else {
                        System.out.println(-1);
                    }
            }

            q--;
        }

    }

}
