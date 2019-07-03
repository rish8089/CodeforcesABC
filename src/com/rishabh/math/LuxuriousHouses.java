package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuxuriousHouses {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int[] floorsToBeAdded = new int[n];
        int rightMax = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            floorsToBeAdded[i] = rightMax < a[i] ? 0 : rightMax - a[i] + 1;
            rightMax=max(rightMax,a[i]);
        }

        StringBuilder ans = new StringBuilder();
        for (int element : floorsToBeAdded) {
            ans = ans.append(element).append(" ");
        }

        System.out.println(ans);


    }

    private static int max(int a, int b) {
        return a < b ? b : a;
    }
}
