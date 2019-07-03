package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRoot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int i = 1;
        while (i * i <= n) {
            i++;
        }

        //i will be the integer part of square root of n
        double ans = i-1;
        int precision = 2;

        double powerOfTen = 1;
        for (i = 1; i <= precision; i++) {
            powerOfTen = powerOfTen * 10;
            int j = 1;
            while (j <= 9 && (ans + j / powerOfTen) * (ans + j / powerOfTen) <= n) {
                j++;
            }

            ans=ans+(j-1)/powerOfTen;
        }

        System.out.println(ans);
    }

}
