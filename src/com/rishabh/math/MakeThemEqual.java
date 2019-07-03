package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeThemEqual {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        List<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            list.add(a[i]);
            while (i + 1 < n && a[i + 1] == a[i]) {
                i++;
            }
        }

        if (list.size() >= 4) {
            System.out.println(-1);
        } else if (list.size() == 3) {
            System.out.println(
                list.get(1) - list.get(0) == list.get(2) - list.get(1) ? list.get(1) - list.get(0)
                    : -1);
        } else if (list.size() == 2) {
            int mid = list.get(1) - list.get(0);
            System.out.println(mid % 2 == 0 ? mid / 2 : list.get(1) - list.get(0));
        } else {
            System.out.println(0);
        }


    }

}
