package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parade {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int l = 0;
        int r = 0;
        Node[] columns = new Node[n];
        for (int i = 0; i < n; i++) {
            String lr[] = br.readLine().split(" ");
            columns[i]=new Node();
            columns[i].l = Integer.parseInt(lr[0]);
            columns[i].r = Integer.parseInt(lr[1]);
            l += columns[i].l;
            r += columns[i].r;
        }
        int maxDiff = -1;
        int pos=-1;
        for (int i = 0; i < n; i++) {
            if (maxDiff < abs(l - r + 2 * columns[i].r - 2 * columns[i].l)) {
                maxDiff = abs(l - r + 2 * columns[i].r - 2 * columns[i].l);
                pos=i;
            }
        }

        System.out.println(abs(l - r) >= maxDiff ? 0 : pos+1);
    }

    static class Node {

        int l;
        int r;
    }

    static int abs(int a) {
        return a < 0 ? -a : a;
    }

}
