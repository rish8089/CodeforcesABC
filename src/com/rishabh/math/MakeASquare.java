package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeASquare {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int idx = 0;
        while (n > 0) {
            arr[idx++] = n % 10;
            n /= 10;
        }

        int x = 0; //first valid binary string
        int y = (1 << idx) - 2; //last valid binary string
        int ans = -1;
        while (x <= y) {

            int temp = x;
            int s = 0;
            int cnt = 0;
            for (int i = 0; i < idx; i++) {
                if (temp % 2 == 0 && !(s == 0 && arr[idx - 1 - i] == 0)) {
                    s = s * 10 + arr[idx - i - 1];
                } else {
                    cnt += 1;
                }
                temp /= 2;
            }

            if (s > 0 && isPerfectSquare(s) && (ans == -1 || ans > cnt)) {
                ans = cnt;
            }

            x++;
        }

        System.out.println(ans);


    }

    private static boolean isPerfectSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }


}
