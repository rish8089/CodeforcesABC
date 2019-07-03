package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValeriyAndDeque {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nq[] = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);

        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        int[] queueFront = new int[n];
        int[] queueEnd = new int[n];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        for (int i = 1; i < n; i++) {
            queueFront[i] = i == 1 ? maximum(a[i - 1], a[i]) : maximum(queueFront[i - 1], a[i]);
            queueEnd[i] = i == 1 ? minimum(a[i - 1], a[i]) : minimum(queueFront[i - 1], a[i]);
        }

        while (q > 0) {
            long m = Long.parseLong(br.readLine());
            if (m == 1) {
                System.out.println(a[0] + " " + a[1]);
            } else if (m < n) {
                System.out.println(queueFront[(int)m - 1] + " " + a[(int)m]);
            } else {
                System.out.println(queueFront[n - 1] + " " + (m % (n - 1) == 0 ? queueEnd[n - 1]
                    : queueEnd[(int)(m % (n - 1))]));
            }
            q--;
        }


    }

    private static int maximum(int a, int b) {
        return a > b ? a : b;
    }

    private static int minimum(int a, int b) {
        return a < b ? a : b;
    }

}
