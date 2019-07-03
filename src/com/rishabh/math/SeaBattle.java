package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeaBattle {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String w1h1w2h2[]=br.readLine().split(" ");

        int w1=Integer.parseInt(w1h1w2h2[0]);
        int h1=Integer.parseInt(w1h1w2h2[1]);
        int w2=Integer.parseInt(w1h1w2h2[2]);
        int h2=Integer.parseInt(w1h1w2h2[3]);

        System.out.println((2*h1+w1+2)+(2*h2+w2+2)+((w1-w2)>0?w1-w2:0));
    }

}
