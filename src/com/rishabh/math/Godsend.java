package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Godsend {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int odds=0;
        String str[]=br.readLine().split(" ");

        for(int i=0;i<n;i++)
        {
            int val=Integer.parseInt(str[i]);
            if(val%2!=0)
                odds++;
        }

        System.out.println(odds==0?"Second":"First");
    }

}
