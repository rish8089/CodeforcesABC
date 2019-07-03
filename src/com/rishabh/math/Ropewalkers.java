package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ropewalkers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []str = br.readLine().split(" ");
        int []a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(a);

        int d = Integer.parseInt(str[3]);
        int time = 0;
        if (a[1] - a[0] < d) {
            time += d - a[1] + a[0];
        }

        if (a[2] - a[1] < d) {
            time += d - a[2] + a[1];
        }

        System.out.println(time);
    }

}
