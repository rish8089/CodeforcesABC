/*
https://codeforces.com/problemset/problem/476/B
 */

/**
 * Algorithm:
 *
 * 1) Get the destination position by considering the commands send by Drazil. (desPos)
 * 2) Now the destination position can be positive or negative. 3) Get the position by considering the commands
 * from Dreammoon, excluding the unrecognized commands. (lets say it currentPos)
 * 3) Do desPos-currentPos , if its >=0, we need that many +, if its <0, we need that many - , remaining
 * would pairs of +-.
 * 4) Now you need to just calculate the probabilit by applying
 * the classical formula = total no of favourable combinations/no of total combinations.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DreamoonAndWiFi {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String drazilCommands = br.readLine();
        int destinationPos = 0;
        for (int i = 0; i < drazilCommands.length(); i++) {
            destinationPos += drazilCommands.charAt(i) == '+' ? 1 : -1;
        }

        String wifiCommands = br.readLine();
        int currentPos = 0;
        int unrecognizedCommands = 0;
        for (int i = 0; i < wifiCommands.length(); i++) {

            if (wifiCommands.charAt(i) == '?') {
                unrecognizedCommands += 1;
            } else {
                currentPos += wifiCommands.charAt(i) == '+' ? 1 : -1;
            }
        }

        int distance = abs(destinationPos - currentPos);
        if (unrecognizedCommands < distance || (unrecognizedCommands - distance) % 2 != 0) {
            System.out.format("%.9f", 0.0);
        } else {
            System.out.format("%.9f",
                (1.0 * nCr(unrecognizedCommands, distance + (unrecognizedCommands - distance) / 2))
                    / (1 << unrecognizedCommands));
        }


    }

    private static int abs(int a) {
        return a < 0 ? -a : a;
    }

    private static int nCr(int n, int r) {
        int nfactorial = 1, rfactorial = 1, nSubrFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nfactorial *= i;
        }

        for (int i = 1; i <= r; i++) {
            rfactorial *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            nSubrFactorial *= i;
        }

        return nfactorial / (rfactorial * nSubrFactorial);

    }

}
