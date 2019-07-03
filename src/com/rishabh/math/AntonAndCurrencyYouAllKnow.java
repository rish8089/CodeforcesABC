package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntonAndCurrencyYouAllKnow {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char []str=br.readLine().toCharArray();
        int lastDigit = str[str.length-1]-'0';
        int candidateEven = -1;
        int candidatePos = -1;

        for(int i=str.length-2;i>=0;i--)
        {
            int x=str[i]-'0';
            if(x%2==0)
            {
                if(candidateEven==-1 || x<lastDigit)
                {
                    candidateEven=x;
                    candidatePos=i;
                }
            }
        }


        if (candidateEven == -1) {
            System.out.println(-1);
        } else {
            char temp = str[str.length-1];
            str[str.length-1] = str[candidatePos];
            str[candidatePos] = temp;

            StringBuilder ans=new StringBuilder();

            for(char ch:str)
                ans=ans.append(ch);

            System.out.println(ans);

        }


    }

}
