package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NiceGarland {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String str[] = {"RGB", "RBG", "GBR", "GRB", "BGR", "BRG"};
        int pos = -1;
        int min = -1;
        for (int i = 0; i < str.length; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != str[i].charAt(j % 3)) {
                    cnt += 1;
                }
            }

            if (min == -1 || min > cnt) {
                min = cnt;
                pos = i;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans = ans.append(str[pos].charAt(i % 3));
        }

        System.out.println(min);
        System.out.println(ans);

    }

}
