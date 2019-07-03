package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanSoloAndLazerGun {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int x0 = Integer.parseInt(str[1]);
        int y0 = Integer.parseInt(str[2]);

        Node coordinates[] = new Node[n];
        for (int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            coordinates[i] = new Node();
            coordinates[i].x = Integer.parseInt(xy[0]);
            coordinates[i].y = Integer.parseInt(xy[1]);
        }

        boolean visited[] = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                cnt += 1;
                for (int j = i + 1; j < n; j++) {
                    if (!visited[j]) {
                        if ((coordinates[j].y - y0) * (coordinates[i].x - x0)
                            == (coordinates[i].y - y0) * (coordinates[j].x - x0)) {
                            visited[j] = true;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }

    private static class Node {

        int x;
        int y;
    }

}
