package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LunarNewYearAndNumberDivision {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n/2;i++)
            ans+=(a[i]+a[n-i-1])*(a[i]+a[n-i-1]);

        System.out.println(ans);
    }

}
