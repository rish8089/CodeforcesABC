package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheWorldIsaTheatre {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nmt[] = br.readLine().split(" ");

        int n = Integer.parseInt(nmt[0]);
        int m = Integer.parseInt(nmt[1]);
        int t = Integer.parseInt(nmt[2]);


    }

    private static long nCr(int n, int r) {
        long nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact = nfact * i;
        }

        long rfact = 1;
        for (int i = 1; i <= r; i++) {
            rfact = rfact * i;
        }
        long nsubrfact = 1;
        for (int i = 1; i <= n - r; i++) {
            nsubrfact = nsubrfact * i;
        }

        return nfact / rfact / nsubrfact;
    }

}
