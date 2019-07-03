package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerGame {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        while (q > 0) {
            String knab[] = br.readLine().split(" ");
            long k = Long.parseLong(knab[0]);
            long n = Long.parseLong(knab[1]);
            long a = Long.parseLong(knab[2]);
            long b = Long.parseLong(knab[3]);

            long minimumBatteryRequired = 1 + n * b;
            if (minimumBatteryRequired > k) {
                System.out.println(-1);
            } else {
                System.out.println(min((k - minimumBatteryRequired) / (a - b), n));
            }

            q--;

        }
    }

    private static long min(long a, long b) {
        return a < b ? a : b;
    }


}
