package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalRoot {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++)
        {
            String str[]=br.readLine().split(" ");
            long k=Long.parseLong(str[0]);
            int x=Integer.parseInt(str[1]);

            System.out.println(x+(k-1)*9);
        }
    }
}
