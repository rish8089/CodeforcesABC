/*
https://codeforces.com/problemset/problem/723/A
 */

/**
 * Here we need to find the minimum distance need to travelled by all friends to reach meeting
 * point. Problem is that we don't know meeting point, so we have to find such meeting point where
 * the total distance travelled is minimum.
 *
 * It is intuitive that such meeting point should be b/w least x and largest x.
 * So lets sort the coordinates and call them as x1,x2,x3.
 *
 * If meeting point is at x2, then total distance travelled = x3-x2+x2-x1=x3-x1
 * If meeting point is b/w x1 and x2, then total distance travelled = point(m)-x1+x2-point(m)+x3-point(m)=x2-x1+x3-point(m)
 * So it is larger than (x3-x1).
 *
 * Suppose meeting point is b/w x2 and x3, then total distance travelled = point(m)-x1+point(m)-x2+x3-point(m)=x3-x1-x2+point(m)
 * this distance is also greater than (x3-x1).
 *
 * So minimum distance travelled to reach meeting point is (x3-x1)
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheNewYearMeetingFriends {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");
        int x1 = Integer.parseInt(str[0]);
        int x2 = Integer.parseInt(str[1]);
        int x3 = Integer.parseInt(str[2]);

        List<Integer> list = new ArrayList<>();
        list.add(x1);
        list.add(x2);
        list.add(x3);
        Collections.sort(list);

        System.out.println(list.get(list.size() - 1) - list.get(0));


    }

}
