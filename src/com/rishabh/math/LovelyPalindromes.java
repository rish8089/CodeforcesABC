/*
https://codeforces.com/problemset/problem/688/B
 */

/**
 *  In this problem, input n is very huge, it takes around 10^5+1 digits.
 *  Now we need to find nth even length palindrome.
 *  Palindromes of even length 2 = 9
 *  Palindromes of even length 4 = 90
 *  Palidromes of even length 6 = 900
 *
 *  1st palindrome=1
 *  2nd palindrome=2
 *
 *  10th palindrome=1001
 *  11th palidrome=1111
 *  12th palindrome=1221
 *  13th pal10idrome=1331
 *
 *  --------
 *
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LovelyPalindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        char ans[]=new char[2*str.length()];

        int i=str.length()-1;
        while(i>=0)
        {
            ans[i]=str.charAt(i);
            ans[i+2*(str.length()-i)-1]=str.charAt(i);
            i--;
        }

        for (i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }

        System.out.println();
    }
}
