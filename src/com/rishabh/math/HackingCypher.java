package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackingCypher {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String ab[] = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        boolean rightDivisibility[] = new boolean[str.length() + 1];
        boolean leftDivisibility[] = new boolean[str.length() + 1];

        int lastRem = 0;
        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i) - '0';
            lastRem = (lastRem) * 10 + val;
            if (lastRem >= a) {
                lastRem %= a;
            }

            leftDivisibility[i] = lastRem == 0;
        }

        lastRem = 0;
        int powerOfTenRem = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            int val = str.charAt(i) - '0';
            lastRem = powerOfTenRem * val + lastRem;
            if (lastRem >= b) {
                lastRem %= b;
            }

            rightDivisibility[i] = lastRem == 0;

            powerOfTenRem *= 10;
            if (powerOfTenRem >= b) {
                powerOfTenRem %= b;
            }
        }
        for (int i = 0; i < str.length() - 1; i++) {
            int val = str.charAt(i + 1) - '0';
            if (val != 0 && leftDivisibility[i] && rightDivisibility[i + 1]) //preventing leading zeros in second part
            {
                System.out.println("YES");
                System.out.println(str.substring(0, i + 1));
                System.out.println(str.substring(i + 1));
                return;
            }
        }

        System.out.println("NO");
    }

}
