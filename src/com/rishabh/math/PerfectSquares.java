package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectSquares {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int val=Integer.parseInt(str[i]);
            if(val<0 || !isPerfectSquare(val))
            {
                if(max<val)
                    max=val;
            }

        }

        System.out.println(max);
    }

    private static boolean isPerfectSquare(int num)
    {
        int x=(int)Math.sqrt(num);
        return x*x==num;
    }

}
