package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CellsNotUnderAttack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[]=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        boolean []visitedRow=new boolean[n+1];
        boolean []visitedCol=new boolean[n+1];
        int rowsCovered=0;
        int colsCovered=0;

        StringBuilder ans=new StringBuilder();

        for(int i=1;i<=m;i++)
        {
            String xy[]=br.readLine().split(" ");
            int x=Integer.parseInt(xy[0]);
            int y=Integer.parseInt(xy[1]);

            if(!visitedRow[x])
            {
                visitedRow[x]=true;
                rowsCovered+=1;
            }

            if(!visitedCol[y])
            {
                visitedCol[y]=true;
                colsCovered+=1;
            }

            ans=ans.append((long)(n-rowsCovered)*(n-colsCovered)).append(" ");


        }
        System.out.println(ans);
    }

}
