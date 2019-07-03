package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FedyaAndMaths {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        if (str.charAt(0) == '0') {
            System.out.println(4);
        } else {
            int temp = (str.length() - 2 >= 0 ? str.charAt(str.length() - 2) - '0' : 0) * 10 + str
                .charAt(str.length() - 1) - '0';
            int mod4 = temp % 4;
            int mod2 = (str.charAt(str.length() - 1) - '0') % 2;
            int powerOfTwoLastDigit = mod4 == 0 ? 6 : mod4 == 1 ? 2 : mod4 == 2 ? 4 : 8;
            int powerOfThreeLastDigit = mod4 == 0 ? 1 : mod4 == 1 ? 3 : mod4 == 2 ? 9 : 7;
            int powerOfFourLastDigit = mod2 == 0 ? 6 : 4;

            System.out.println(
                (1 + powerOfTwoLastDigit + powerOfThreeLastDigit + powerOfFourLastDigit) % 5);
        }

    }

}
