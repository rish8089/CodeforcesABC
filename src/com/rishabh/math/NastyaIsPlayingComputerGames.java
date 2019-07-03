package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NastyaIsPlayingComputerGames {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk[] = br.readLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int currPos = n - k + 1;
        if (currPos - 1 > n - currPos) {
            System.out.println(n * 2 + 1 + n - 1 + n - currPos);
        } else {
            System.out.println(n * 2 + 1 + n - 1 + currPos - 1);
        }

    }

}
