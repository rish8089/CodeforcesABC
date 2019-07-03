package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NickAndArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
            if (a[i] >= 0) {
                a[i] = -a[i] - 1;
            }
        }

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            int negativeMaximum = Integer.MAX_VALUE;
            int pos = -1;
            for (int i = 0; i < n; i++) {
                if (negativeMaximum>a[i]) {
                    negativeMaximum = a[i];
                    pos = i;
                }
            }

            for (int i = 0; i < n; i++) {
                if (pos == i) {
                    System.out.print(-a[i] - 1 + " ");
                } else {
                    System.out.print(a[i] + " ");
                }
            }
        }

        System.out.println();
    }




}

