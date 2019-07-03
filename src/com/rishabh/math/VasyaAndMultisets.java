package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VasyaAndMultisets {

    private static int lim=100;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

        int hash[] = new int[lim+1];
        boolean numGreaterThan2 = false;
        int niceNumbers = 0;
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        for (int i = 1; i <= lim; i++) {
            if (hash[i] == 1) {
                niceNumbers += 1;
            }

            if (hash[i] > 2) {
                numGreaterThan2 = true;
            }
        }

        StringBuilder ans = new StringBuilder();

        if (niceNumbers % 2 == 0 || numGreaterThan2) {
            int cnt = 0;
            boolean numGreaterThan2Visited = false;

            ans.append("YES").append("\n");

            for (int i = 0; i < n; i++) {
                if (hash[a[i]] == 1) {
                    if (cnt >= (niceNumbers + 1) / 2) {
                        ans.append("B");
                    } else {
                        ans.append("A");
                        cnt += 1;
                    }
                } else if (niceNumbers%2!=0 && hash[a[i]] > 2 && !numGreaterThan2Visited) {
                    ans.append("B");
                    numGreaterThan2Visited=true;
                } else {
                    ans.append("A");
                }
            }
        } else {
            ans.append("NO").append("\n");
        }

        System.out.println(ans);

    }

}
