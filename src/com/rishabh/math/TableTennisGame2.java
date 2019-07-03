package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableTennisGame2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String kab[] = br.readLine().split(" ");
        int k = Integer.parseInt(kab[0]);
        int a = Integer.parseInt(kab[1]);
        int b = Integer.parseInt(kab[2]);

        if (a < k && b < k) {
            System.out.println(-1);
        } else if (a < k) {
            if (b % k == 0) {
                System.out.println(b / k);
            } else {
                System.out.println(-1);
            }
        } else if (b < k) {
            if (a % k == 0) {
                System.out.println(a / k);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(a/k+b/k);
        }
    }

}
