package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HungrySequence {

    private static int lim=10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> primes=new ArrayList<>();
        boolean []sieve=new boolean[lim+1];

        for(int i=2;i*i<=lim;i++)
        {
            if(!sieve[i]) {
                for (int j = i * i; j <= lim; j += i) {
                    sieve[j]=true;
                }
            }
        }

        for(int i=2;i<=lim;i++)
        {
            if(!sieve[i])
                primes.add(i);
        }

        int n=Integer.parseInt(br.readLine());

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n;i++)
            ans=ans.append(primes.get(i)).append(" ");

        System.out.println(ans);


    }

}
