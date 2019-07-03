package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NekoFindsGrapes {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm[]=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        String chests[]=br.readLine().split(" ");
        String keys[]=br.readLine().split(" ");

        int oddChests=0;
        int evenChests=0;
        for(int i=0;i<n;i++)
        {
            int val=Integer.parseInt(chests[i]);
            if(val%2==0)
                evenChests+=1;
            else
                oddChests+=1;
        }

        int oddKeys=0;
        int evenKeys=0;
        for(int i=0;i<m;i++)
        {
            int val=Integer.parseInt(keys[i]);
            if(val%2==0)
                evenKeys+=1;
            else
                oddKeys+=1;
        }

        System.out.println(min(oddChests,evenKeys)+min(evenChests,oddKeys));
    }

    private static int min(int a,int b)
    {
        return a<b?a:b;
    }


}
