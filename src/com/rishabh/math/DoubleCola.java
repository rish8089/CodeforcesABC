/*
https://codeforces.com/problemset/problem/82/A
 */

/**
 * Algorithm
 *
 * If you look closely, we have GP, 5x1 + 5x2 + 5x4 + 5x8 So we equalise n=5x1+5x2+5x4-------5*2^x.
 * You will get some no of terms and that will be x+1 because gp starts with 2^0*5
 *
 * After getting no of terms, calculate GP sum and subtract it from n, you will get no of cold
 * drinks still left. If there is no cold drinks left,then answer will be 5th one i.e. Howard. If we
 * have no of drinks left > 0, then we will have to divide it by 2^(x+1), suppose it is p If some
 * remainder is left, then it will be (p+1)th person else pth person.
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleCola {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String people[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int n = Integer.parseInt(br.readLine());
        int noOfRounds = (int) (Math.log(n / 5.0 + 1) / Math.log(2));
        int rem = n - 5 * ((int) Math.pow(2, noOfRounds) - 1);

        if (rem == 0) {
            System.out.println(people[4]);
        } else {

            int nextPowerOfTwo = 1 << noOfRounds;
            int p = rem / nextPowerOfTwo + (rem % nextPowerOfTwo > 0 ? 1 : 0);

            System.out.println(people[p - 1]);
        }

    }

}
