package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherProblemOnStrings {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();

        if (k == 0) {
            long ans = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    int cnt = 1;
                    while (i + 1 < str.length() && str.charAt(i + 1) == '0') {
                        i++;
                        cnt+=1;
                    }
                    ans += (long) cnt * (cnt + 1) / 2;
                }
            }

            System.out.println(ans);
        } else {

            int ones = 0;
            long cnt = 0;
            int currentWindow = 0;
            for (int i = 0; i < str.length(); i++) {

                ones += str.charAt(i) == '1' ? 1 : 0;

                if (ones == k) {

                    int currentPos = i;
                    while (i + 1 < str.length() && str.charAt(i + 1) == '0') {
                        i++;
                    }

                    while (currentWindow < str.length() && str.charAt(currentWindow) == '0') {
                        currentWindow += 1;
                        cnt += i - currentPos + 1;
                    }

                    if (currentWindow < str.length()) {
                        currentWindow += 1;
                        ones -= 1;
                        cnt += i - currentPos + 1;
                    }


                }


            }

            System.out.println(cnt);
        }
    }

}
