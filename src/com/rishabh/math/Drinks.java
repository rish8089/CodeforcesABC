/*
https://codeforces.com/problemset/problem/200/B
 */
/**
 * Algorithm
 *
 * We need to calculate volume fraction percentage of the orange juice inside cocktail.
 * So lets focus on getting the volume fraction of the orange juice and then we will multiply it by 100
 *
 * So lets assume we have x units of cocktail.
 * As given in the question, we take equal amount of each drink (x/n).
 *
 * Total amount of orange juice=p1*(x/n)+p2*(x/n)+p3*(x/n)--------------
 *
 * Divide it by total amount of cocktail which is x.
 *
 * So volume fraction of orange juice=p1/n+p2/n+p3/n+--------------
 * After getting it , just multiply it by 100 to get volume fraction percentage of the orange juice inside cocktail.
 *
 */
package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drinks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        String str[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(str[i]);

        double sum=0;
        for(int i=0;i<n;i++) sum+=a[i];

        System.out.format("%.4f",sum/n);

    }

}
