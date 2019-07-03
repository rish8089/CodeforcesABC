package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonAndFairyTale {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        long n = Long.parseLong(nm[0]);
        long m = Long.parseLong(nm[1]);

        if (n <= m) {
            System.out.println(n);
        } else {
            long x = n-m;
            long noOfDays = (long) (-1 + Math.sqrt(1 + 8 * x)) / 2;

            //here we are dealing with numbers with 10^18 digits, so can't rely upon double
            if (noOfDays * (noOfDays + 1) / 2 < x) {
                noOfDays += 1;
            }
            System.out.println(m + noOfDays);

        }
    }
}
