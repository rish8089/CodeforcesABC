package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NewYearAndTheSphereTransmission {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long []temp = new long[(int) Math.sqrt(n) * 2 + 1];
        int idx = 0;
        for (int i = 1; i * i <= n; i++) {

            if(n%i==0) {
                int j = n / i; //length of sequence
                // i is how many steps to move forward

                if (j != i) {
                    temp[idx++] = (long)j * (2 + (j - 1) * i) / 2;
                    temp[idx++] = (long)i * (2 + (i - 1) * j) / 2;
                } else {
                    temp[idx++] = (long)j * (2 + (j - 1) * i) / 2;
                }
            }
        }

        Arrays.sort(temp,0,idx);

        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < idx; i++) {
            ans=ans.append(temp[i]).append(" ");
        }

        System.out.println(ans);

    }

}
