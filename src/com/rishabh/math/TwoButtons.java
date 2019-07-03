/*
https://codeforces.com/problemset/problem/520/B
 */

/**
 * Algorithm
 *
 * n means the number initially displaying.
 * m means the number we want to achieve.
 *
 * Here there is no greedy approach. So we can take up bfs here to reach to the shortest path( from n to m)
 *
 */

package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class TwoButtons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[]=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        System.out.println(m<=n?n-m:bfs(n,m));

    }

    private static int bfs(int source,int destination)
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(source,0));
        boolean visited[]=new boolean[2*destination];
        visited[source]=true;

        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            if(temp.v==destination)
                return temp.l;

            if(temp.v<destination && !visited[temp.v*2]) {
                queue.add(new Node(temp.v * 2, temp.l + 1));
                visited[temp.v * 2] = true;
            }

            if(temp.v>1 && !visited[temp.v-1]) {
                queue.add(new Node(temp.v - 1, temp.l + 1));
                visited[temp.v-1]=true;
            }
        }
        return -1;
    }

    static class Node
    {
        int v;
        int l;

        public Node(int v, int l) {
            this.v = v;
            this.l = l;
        }
    }



}
