package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheEternalImmortality {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ab[] = br.readLine().split(" ");
        long a = Long.parseLong(ab[0]);
        long b = Long.parseLong(ab[1]);

        long x = (b / 10) * 10;
        if (a < x) { //some 10^power, will be there in the expansion of a!/b!
            System.out.println(0);
        } else {
            long end = b % 10;
            long start = (a + 1) % 10;
            long prod = 1;
            while (end >= start) {
                prod = prod * end;
                end--;
            }

            System.out.println(prod % 10);
        }


    }

}
