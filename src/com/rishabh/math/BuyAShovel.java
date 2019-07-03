/*
https://codeforces.com/problemset/problem/732/A
 */

/**
 * Here we have to find the minimum no of shovels, so that he give the whole amount of money exactly.
 * Suppose 15 is the final cost, so he should be able to give 15 exactly , in this case (10+5)
 *
 * So just traverse i=1 to 10, i denotes no of shovels, multiply it with k (cost of each shovel) and mod it with 10.
 * You will get some remaining amount of money 0<=rem<=9, if its 0 or rem==r then return i
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyAShovel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String kr[]=br.readLine().split(" ");

        int k=Integer.parseInt(kr[0]);
        int r=Integer.parseInt(kr[1]);

        for(int i=1;i<=10;i++){
            int rem=(i*k)%10;
            if(rem==0 || rem==r)
            {
                System.out.println(i);
                return;
            }
        }

    }

}
