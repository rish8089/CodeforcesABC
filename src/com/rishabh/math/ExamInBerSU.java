package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ExamInBerSU {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((t1,t2)-> {
                if(t1.equals(t2))
                    return 0;
                else  if(t1<t2)
                    return 1;
                else
                    return -1;
            });
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        List<Integer> tempList = new ArrayList<>();
        int sum = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (sum > m) {
                int temp=sum;
                int cnt=0;
                while(temp>m && !pq.isEmpty())
                {
                    temp-=pq.peek();
                    cnt+=1;
                    tempList.add(pq.poll());
                }

                ans=ans.append(cnt).append(" ");
                pq.addAll(tempList);
                tempList.clear();

            } else {
                ans = ans.append(0).append(" ");
            }

            pq.add(a[i]);

        }

        System.out.println(ans);

    }

}
