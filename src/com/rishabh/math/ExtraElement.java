package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ExtraElement {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        Node a[] = new Node[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Node();
            a[i].a = Integer.parseInt(str[i]);
            a[i].b = i;
        }

        Arrays.sort(a, (t1, t2) -> {
            if (t1.a == t2.a) {
                return 0;
            } else if (t1.a < t2.a) {
                return -1;
            } else {
                return 1;
            }
        });

        boolean leftCheck[] = new boolean[n];
        boolean rightCheck[] = new boolean[n];
        leftCheck[1] = true;
        leftCheck[0] = true;
        int currentD = a[1].a - a[0].a;
        for (int i = 2; i < n; i++) {
            if (leftCheck[i - 1] && a[i].a - a[i - 1].a == currentD) {
                leftCheck[i] = true;
            }
        }

        rightCheck[n - 2] = true;
        rightCheck[n - 1] = true;
        currentD = a[n - 1].a - a[n - 2].a;
        for (int i = n - 3; i >= 0; i--) {
            if (rightCheck[i + 1] && a[i + 1].a - a[i].a == currentD) {
                rightCheck[i] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && i + 1 < n) //removing element at i
            {
                if (leftCheck[i - 1] && rightCheck[i + 1]) {
                    int d1 = i - 1 == 0 ? a[i + 1].a - a[i - 1].a : a[i - 1].a - a[i - 2].a;
                    int d2 = i + 1 == n - 1 ? a[i + 1].a - a[i - 1].a : a[i + 2].a - a[i + 1].a;

                    if (d1 == d2 && a[i + 1].a - a[i - 1].a == d1) {
                        System.out.println(a[i].b + 1);
                        return;
                    }

                }
            } else if (i - 1 >= 0) {
                if (leftCheck[i - 1]) {
                    System.out.println(a[i].b + 1);
                    return;
                }
            } else {
                if (rightCheck[i + 1]) {
                    System.out.println(a[i].b + 1);
                    return;
                }
            }

        }

        System.out.println(-1);
    }

    static class Node {

        int a;
        int b;
    }

}
