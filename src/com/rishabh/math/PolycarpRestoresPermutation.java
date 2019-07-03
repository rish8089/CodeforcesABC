package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolycarpRestoresPermutation {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] q = new int[n - 1];

        int cumulativeSum = 0;
        int minCumulativeSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            q[i] = Integer.parseInt(str[i]);
            cumulativeSum += q[i];
            if (minCumulativeSum > cumulativeSum) {
                minCumulativeSum = cumulativeSum;
            }

        }

        int candidateP1 =
            minCumulativeSum < 0 ? 1 - minCumulativeSum : minCumulativeSum == 1 ? 1 : -1;

        StringBuilder ans = new StringBuilder();
        if (candidateP1 < 1 || candidateP1>n) {
            ans.append("-1");
        } else {
            boolean[] visited = new boolean[n + 1];
            visited[candidateP1] = true;
            cumulativeSum = candidateP1;
            int cnt = 1;
            ans.append(candidateP1).append(" ");
            for (int i = 0; i < n-1; i++) {
                cumulativeSum += q[i];
                if (cumulativeSum <= n && !visited[cumulativeSum]) {
                    visited[cumulativeSum] = true;
                    cnt += 1;
                }
                ans.append(cumulativeSum).append(" ");
            }

            if(cnt<n)
            {
                ans.setLength(0);
                ans.append("-1");
            }
        }

        System.out.println(ans);

    }

}
