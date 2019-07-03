package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DrazilAndFactorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int maxFactorialRepresentation[] = new int[10];
        maxFactorialRepresentation[2] = 2;
        maxFactorialRepresentation[3] = 3;
        maxFactorialRepresentation[4] = 322;
        maxFactorialRepresentation[5] = 5;
        maxFactorialRepresentation[6] = 53;
        maxFactorialRepresentation[7] = 7;
        maxFactorialRepresentation[8] = 7222;
        maxFactorialRepresentation[9] = 7332;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) > '1') {
                ans.append(maxFactorialRepresentation[str.charAt(i) - '0']);
            }
        }

        char res[] = ans.toString().toCharArray();
        Arrays.sort(res);
        ans.setLength(0);
        for (int i = res.length - 1; i >= 0; i--) {
            ans = ans.append(res[i]);
        }

        System.out.println(ans);


    }

}
