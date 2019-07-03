package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingATVSet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[]=br.readLine().split(" ");
        long a=Long.parseLong(str[0]);
        long b=Long.parseLong(str[1]);
        long x=Long.parseLong(str[2]);
        long y=Long.parseLong(str[3]);

        long highestCommonFactor=gcd(x,y);
        x=x/highestCommonFactor;
        y=y/highestCommonFactor;

        System.out.println(min(a/x,b/y));



    }

    static long gcd(long a,long b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    static long min(long a,long b)
    {
        return a<b?a:b;
    }
}
