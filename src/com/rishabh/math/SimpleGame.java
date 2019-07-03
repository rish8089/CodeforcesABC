package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[]=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        if (n == 1) {
            System.out.println(1);
        }
        else {

            if (n - m > m - 1) {
                System.out.println(m + 1);
            } else {
                System.out.println(m - 1);
            }
        }
    }

}
