package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AAndBAndTeamTraining {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[] = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int ans = 0;
        while (n > 0 && m > 0) {
            if (n > m) {
                n = n - 2;
                m = m - 1;
            } else {
                if (m == 1) {
                    break;
                }
                m = m - 2;
                n = n - 1;
            }
            ans+=1;
        }

        System.out.println(ans);


    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
