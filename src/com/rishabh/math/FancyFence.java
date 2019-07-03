/*
https://codeforces.com/problemset/problem/270/A
 */

/**
 * Here we have to find if the regular polygon is possible with each side 'a'.
 * First you need to know that sum of all exterior angles is 360.
 * Each  exterior angle = 360/n
 * Interior angle=a;
 * a=180-360/n
 * an=180(n-2)=>(180-a)n=360, n= 360/(180-a) ,if its a integer then "YES" else "NO".
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FancyFence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());
        while(T>0)
        {
            int a=Integer.parseInt(br.readLine());
            System.out.println(360%(180-a)==0?"YES":"NO");
            T--;
        }
    }

}
