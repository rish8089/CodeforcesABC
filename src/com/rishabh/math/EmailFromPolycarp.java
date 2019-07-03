package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailFromPolycarp {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String required = br.readLine();
            String typed = br.readLine();

            int idx = 0;
            boolean flag=true;
            for (int i = 0; i < required.length(); i++) {

                char ch = required.charAt(i);
                int cnt1 = 1;
                int cnt2 = 0;
                while (i + 1 < required.length() && required.charAt(i + 1) == ch) {
                    i++;
                    cnt1++;
                }

                while (idx < typed.length() && typed.charAt(idx) == ch) {
                    idx++;
                    cnt2++;
                }

                if (cnt1 > cnt2) {
                    flag=false;
                    break;
                }


            }


            System.out.println(flag && idx==typed.length()?"YES":"NO");
            n--;



        }
    }

}
