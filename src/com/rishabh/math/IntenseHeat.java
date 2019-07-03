package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntenseHeat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk[] = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        double ans=0;
        for (int i = k; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }

            int max = sum;

            for (int j = i; j < n; j++) {
                sum += arr[j] - arr[j - i];
                if (max < sum) {
                    max = sum;
                }
            }

            if(ans<(double)max/i)
                ans=(double)max/i;


        }

        System.out.format("%.6f",ans);

    }

}
