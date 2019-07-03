package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CandyBoxEasyVersion {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        while (q > 0) {
            int n = Integer.parseInt(br.readLine());
            String str[] = br.readLine().split(" ");
            int hash[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                hash[val]++;
            }

            Arrays.sort(hash);
            int next = hash[n];
            int ans = 0;
            for (int i = n; i >= 1 && next > 0; i--) {
                int x=min(hash[i],next);
                ans+=x;
                next=x-1;

            }
            System.out.println(ans);
            q--;
        }

    }

    private static int min(int a,int b)
    {
        return a<b?a:b;
    }

}
