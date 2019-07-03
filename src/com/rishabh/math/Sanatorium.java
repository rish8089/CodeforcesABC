package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sanatorium {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []str=br.readLine().split(" ");

        long []a=new long[3];

        for(int i=0;i<3;i++)
            a[i]=Long.parseLong(str[i]);

        long max=0;
        for(int i=0;i<3;i++)
        {
            if(max<a[i])
                max=a[i];
        }

        long cnt=0;
        for(int i=0;i<3;i++)
        {
            if(a[i]!=max)
            {
                cnt+=max-1-a[i];/**/
            }
        }

        System.out.println(cnt);


    }

}
