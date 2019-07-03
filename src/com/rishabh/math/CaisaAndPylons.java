package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaisaAndPylons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int currentHeight = 0;
        int ans = 0;
        int currentEnergy = 0;
        for (int i = 0; i < n; i++) {
            if (currentHeight >= a[i]) {
                currentEnergy += currentHeight - a[i];
            } else {
                if (currentEnergy < a[i] - currentHeight)//not sufficient energy
                {
                    ans += a[i] - currentHeight - currentEnergy;
                    currentEnergy = 0;
                } else {
                    currentEnergy -= a[i] - currentHeight;
                }

            }
            currentHeight = a[i];
        }

        System.out.println(ans);


    }

}
