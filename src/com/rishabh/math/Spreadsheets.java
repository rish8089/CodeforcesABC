/*
https://codeforces.com/problemset/problem/1/B
 */

/**
 * Here we have to deal with base 26, conversion from num to base 26 form, and base 26 form to num.
 * Here base 26 form is represented from A to Z.
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spreadsheets {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T > 0) {
            String str = br.readLine();
            int R = 0;
            int C = 0;
            int i = 0;
            StringBuilder Calphabeticform = new StringBuilder("");
            if (isRXCYForm(str)) {
                //it belongs to RXCY, X and Y in digits
                i = i + 1;
                while (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    R = R * 10 + str.charAt(i) - '0';
                    i++;
                }

                C = Integer.parseInt(str.substring(i + 1));

                while (C > 0) {

                    if (C % 26 == 0) {
                        Calphabeticform.append('Z');
                        C = C / 26 - 1;
                    } else {
                        Calphabeticform.append((char) (C % 26 + 'A' - 1));
                        C = C / 26;
                    }
                }

                System.out.print(Calphabeticform.reverse());
                System.out.println(R);

            } else {
                //column value in alphabets and row value in digits
                while (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    i++;
                }

                R = Integer.parseInt(str.substring(i));

                i = i - 1;
                int multiplier = 1;
                while (i >= 0) {
                    C = C + multiplier * (str.charAt(i) - 'A' + 1);
                    multiplier = multiplier * 26;
                    i--;
                }

                System.out.println("R" + R + "C" + C);
            }
            T--;
        }
    }

    private static boolean isRXCYForm(String str) {
        if (str.charAt(0) == 'R') {
            int i = 1;
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                i++;
            }
            if (i > 1 && i < str
                .length()) {//i>1, shows some numeric part is there just after R, i<str.length s,shows it was not ended on digits.
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}
