package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmrAndPins {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        int r = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int y = Integer.parseInt(str[2]);
        int x1 = Integer.parseInt(str[3]);
        int y1 = Integer.parseInt(str[4]);

        boolean isPerfectSqrt = isPerfectSquare(
            (long) (x1 - x) * (x1 - x) + (long) (y1 - y) * (y1 - y));

        long distance = (long) Math.sqrt((long) (x1 - x) * (x1 - x) + (long) (y1 - y) * (y1 - y));

        long ans=distance/(2*r)+(distance%(2*r)>0?1:0);

        if(distance%(2*r)==0 && !isPerfectSqrt)
            ans+=1;

        System.out.println(ans);


    }

    private static boolean isPerfectSquare(long num) {
        long x = (long) Math.sqrt(num);
        return x * x == num;
    }

}
