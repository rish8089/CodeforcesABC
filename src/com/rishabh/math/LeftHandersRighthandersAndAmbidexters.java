package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftHandersRighthandersAndAmbidexters {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lra[] = br.readLine().split(" ");
        int l = Integer.parseInt(lra[0]);
        int r = Integer.parseInt(lra[1]);
        int a = Integer.parseInt(lra[2]);

        int diff = abs(l - r);

        if (a <= diff) {
            System.out.println((min(l, r) + a) * 2);
        } else {
            System.out.println(l + r + diff + (a - diff) / 2 * 2);
        }
    }

    private static int abs(int a) {
        return a < 0 ? -a : a;
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
