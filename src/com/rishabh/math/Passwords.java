package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Passwords {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nk[] = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int passwordsOfLengthLesserThan = 0;
        int passwordsOfLengthLesserThanEqualTo = 0;

        String passwords[] = new String[n];

        for (int i = 0; i < n; i++) {
            passwords[i] = br.readLine();
        }

        String actualPassword = br.readLine();
        for (int i = 0; i < n; i++) {
            if (passwords[i].length() <= actualPassword.length()) {
                if (passwords[i].length() < actualPassword.length()) {
                    passwordsOfLengthLesserThan++;
                }
                passwordsOfLengthLesserThanEqualTo++;
            }

        }

        System.out.println(
            passwordsOfLengthLesserThan + (passwordsOfLengthLesserThan / k) * 5 + 1 + " " + (
                passwordsOfLengthLesserThanEqualTo + (passwordsOfLengthLesserThanEqualTo-1) / k * 5));

    }

}
