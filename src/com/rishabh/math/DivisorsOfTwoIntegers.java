package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorsOfTwoIntegers {

    private static final int lim = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int []hash = new int[lim + 1];

        String []str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(str[i]);
            hash[val]++;
        }

        int x = 1;
        int y = 1;

        for (int i = 1; i <= lim; i++) {
            if (hash[i] > 0) {
                if (hash[i] == 2) {
                    x = lcm(x, i);
                    y = lcm(y, i);
                } else {
                    int temp=lcm(x,i);
                    if(temp<=lim && hash[temp]>0)
                        x=lcm(x,i);
                    else
                        y=lcm(y,i);
                }
            }
        }

        System.out.println(x+" "+y);


    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
