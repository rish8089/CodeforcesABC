package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chips {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nm[]=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);

        int chipsRequiredInOneRound=n*(n+1)/2;
        int remainingChips=m%chipsRequiredInOneRound;

        int noOfPeopleChipsCanBeDistribuedTo=(int)(-1+Math.sqrt(1+8*remainingChips))/2;
        System.out
            .println(remainingChips-noOfPeopleChipsCanBeDistribuedTo*(noOfPeopleChipsCanBeDistribuedTo+1)/2);



    }

}
