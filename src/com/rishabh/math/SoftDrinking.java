/*https://codeforces.com/problemset/problem/151/A*/

/**
 * Here there are various parameters:
 *
 * n-> no of friends,
 * k-> no of bottles,
 * l-> volume of drink,
 * c-> no of limes
 * d-> no of slices per lime
 * p-> no of grams of salt
 * nl-> volume of drink needed per friend to make a toast
 * np-> salt needed per friend to make a toast.
 *
 * We need to make maximum no of toasts, so its easy min(k*l/(n*nl),c*d/n,p/(n*np))
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoftDrinking {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[]=br.readLine().split(" ");

        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        int l=Integer.parseInt(str[2]);
        int c=Integer.parseInt(str[3]);
        int d=Integer.parseInt(str[4]);
        int p=Integer.parseInt(str[5]);
        int nl=Integer.parseInt(str[6]);
        int np=Integer.parseInt(str[7]);

        System.out.println(min(k*l/(n*nl),c*d/n,p/(np*n)));
    }

    private static int min(int a,int b,int c)
    {
        return min(min(a,b),c);
    }

    private static int min(int a,int b)
    {
        return a<b?a:b;
    }

}
