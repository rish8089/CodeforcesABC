/*
https://codeforces.com/problemset/problem/734/B
 */

/**
 * Here we have k2 2 digits, k3 3 digits, k5 digits 5 and k6 digits 6.
 * Now we need to get min(k2,k5,k6), so those many 256's
 * Subtract min(k2,k5,k6) from k2 (let it be k2').
 * Now we need to get min(k2',k3), so those many 32's
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[]=br.readLine().split(" ");
        int k2=Integer.parseInt(str[0]);
        int k3=Integer.parseInt(str[1]);
        int k5=Integer.parseInt(str[2]);
        int k6=Integer.parseInt(str[3]);

        int k2temp=min(min(k2,k5),k6);
        System.out.println(k2temp*256L+min(k2-k2temp,k3)*32L);
    }

    private static int min(int a,int b)
    {
        return a<b?a:b;
    }

}
