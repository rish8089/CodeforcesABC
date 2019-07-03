package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GourmetCat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        int days[] = new int[7];
        days[0] = 1;
        days[1] = 2;
        days[2] = 3;
        days[3] = 1;
        days[4] = 3;
        days[5] = 2;
        days[6] = 1;

        int rema;
        int remb;
        int remc;
        int noOfWeeks;
        int remDays;
        int maxNoOfDays = 0;
        for (int i = 0; i < 7; i++) {
            //1 means Monday, 2 means Tuesday and so on.

            noOfWeeks = min(min(a / 3, b / 2), c / 2);

            rema = a - noOfWeeks * 3;
            remb = b - noOfWeeks * 2;
            remc = c - noOfWeeks * 2;

            remDays = 0;
            boolean flag = true;
            for (int j = i; j < i + 7; j++) {
                switch (days[j % 7]) {
                    case 1:
                        if (rema > 0) {
                            rema -= 1;
                        } else {
                            flag = false;
                        }
                        break;
                    case 2:
                        if (remb > 0) {
                            remb -= 1;
                        } else {
                            flag = false;
                        }
                        break;
                    case 3:
                        if (remc > 0) {
                            remc -= 1;
                        } else {
                            flag = false;
                        }
                }

                if (flag) {
                    remDays += 1;
                } else {
                    break;
                }
            }

            if (maxNoOfDays < noOfWeeks * 7 + remDays) {
                maxNoOfDays = noOfWeeks * 7 + remDays;
            }

        }

        System.out.println(maxNoOfDays);

    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
