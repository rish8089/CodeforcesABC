//package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreatingTheContest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str[] = br.readLine().split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {

            int cnt = 1;

            while (i + 1 < n && a[i+1]<=2*a[i]) {
                cnt++;
                i++;
            }
            if (max < cnt) {
                max = cnt;
            }
        }

        System.out.println(max);


    }
}
