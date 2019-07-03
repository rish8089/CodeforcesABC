/*
https://codeforces.com/problemset/problem/822/A
 */

/**
 * There are given two integers A and B. We have to tell gcd(A!,B!)
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImBoredWithLife {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ab[]=br.readLine().split(" ");

        int a=Integer.parseInt(ab[0]);
        int b=Integer.parseInt(ab[1]);

        int x=min(a,b);
        int ans=1;
        for(int i=1;i<=x;i++)
            ans=ans*i;

        System.out.println(ans);


    }

    private  static int min(int a,int b)
    {
        return a<b?a:b;
    }

}
