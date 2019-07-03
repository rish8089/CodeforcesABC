//package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemoryAndCrow {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        String str[]=br.readLine().split(" ");
        int a[]=new int[n];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(str[i]);
        }

        for(int i=0;i<n-1;i++)
        {
            ans.append(a[i]+a[i+1]).append(" ");
        }
        ans.append(a[n-1]);

        System.out.println(ans);
    }

}
