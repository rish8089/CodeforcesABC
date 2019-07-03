package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewYearAndRating {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Node[] arr = new Node[n];
        for (int i = 0; i < n; i++) {
            String[] rd = br.readLine().split(" ");
            arr[i] = new Node();
            arr[i].ratingChanges = Integer.parseInt(rd[0]);
            arr[i].division = Integer.parseInt(rd[1]);
        }

        int maximumRating = -1;
        int prevDivision = arr[0].division;
        int ratingChanges = arr[0].ratingChanges;

        /*for (int i = 1; i < n; i++) {
            if (arr[i].division == 2) {
                if (prevDivision == 1) {
                    if (ratingChanges >= 0) {
                        System.out.println("Impossible");
                        return;
                    } else {
                        if (maximumRating != -1) {
                            maximumRating += ratingChanges;
                        }
                        ratingChanges = arr[i].ratingChanges;
                    }
                } else {
                    ratingChanges += arr[i].ratingChanges;
                }

            } else {
                if (prevDivision == 1) {
                    ratingChanges += arr[i].ratingChanges;
                } else {
                    if (ratingChanges <= 0) {
                        System.out.println("Impossible");
                        return;
                    } else {
                        if (maximumRating == -1) {

                        } else {
                            maximumRating += ratingChanges;
                        }
                        ratingChanges = arr[i].ratingChanges;
                    }

                }
            }

            prevDivision = arr[i].division;
        }

        if (prevDivision == 2) {
            if (maximumRating == -1) {
                maximumRating = 1899 + arr[n - 1].ratingChanges;
            } else {
                maximumRating += ratingChanges;
            }
        } else {
            if (maximumRating != -1) {
                maximumRating += ratingChanges;
            }
        }

        System.out.println(maximumRating == -1 ? "Infinity" : maximumRating);*/

    }

    static class Node {

        int ratingChanges;
        int division;
    }

}
