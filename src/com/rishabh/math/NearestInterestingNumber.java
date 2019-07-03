package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestInterestingNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int firstDigit = n % 10;
        int sum=getSumOfDigits(n);

        int rem = ((sum / 4 + 1) * 4 - sum) % 4;

        if (firstDigit + rem <= 9) {
            System.out.println(n / 10 * 10 + firstDigit + rem);
        } else {
            sum=getSumOfDigits(n/10+1)%4;
            rem = ((sum / 4 + 1) * 4 - sum) % 4;
            System.out.println((n/10+1)*10+rem);
        }


    }

    private static int getSumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum=sum+x;
            n=n/10;
        }
        return sum;
    }


}
