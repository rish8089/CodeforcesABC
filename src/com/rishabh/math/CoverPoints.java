package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoverPoints {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            String xy[]=br.readLine().split(" ");
            int x=Integer.parseInt(xy[0]);
            int y=Integer.parseInt(xy[1]);
            if(ans<x+y)
                ans=x+y;
        }

        System.out.println(ans);
    }

}
