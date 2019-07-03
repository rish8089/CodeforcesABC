package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KyoyaAndPhotobooks {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int totalCombinations = (str.length() + 1) * 26;
        for (int i = 0; i < str.length(); i++) {
            int cnt = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
                i++;
            }

            totalCombinations -= cnt;
        }

        System.out.println(totalCombinations);
    }

}
