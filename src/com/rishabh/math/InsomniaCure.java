/*
https://codeforces.com/problemset/problem/148/A
 */

/**
 * Algorithm
 *
 * Basically we have to find indexes (1 to N) which are divisible either by l,k,m,n
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsomniaCure {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int d=Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=1;i<=d;i++)
        {
            if(i%l==0 || i%k==0 || i%m==0 || i%n==0)
                cnt+=1;
        }

        System.out.println(cnt);

    }

}
