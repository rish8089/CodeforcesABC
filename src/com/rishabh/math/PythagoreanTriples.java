package com.rishabh.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythagoreanTriples {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        //first assumption is 2*m*n=a
        long m, n;
        if (a % 2 == 0) {
            if (a == 2) {
                System.out.println(
                    -1); //2 cannot be hypotenuse, it cannot be cathetus also as we would obtain the other side
            } else {
                n = 1;
                m = a / 2;
                System.out.println(m * m - n * n + " " + (m * m + n * n));
            }
        } else {
            //can it be hypotenuse?
            for (long i = 1; i * i <= a; i++) {
                long sqrt = isPerfectSquare(a - i * i);
                if (sqrt != -1 && sqrt >= i) {
                    n = i;
                    m = sqrt;
                    System.out.println(m * m - n * n + " " + (2 * m * n));
                    return;
                }

                if (a % i == 0) {
                    if ((i + a / i) % 2 == 0 && ((a / i - i) > 0 && (a / i - i) % 2 == 0)) {
                        n = (a / i - i) / 2;
                        m = (a / i + i) / 2;
                        System.out.println(2 * m * n + " " + (m * m + n * n));
                        return;
                    }
                }


            }

            System.out.println(-1);

        }


    }

    private static long isPerfectSquare(long num) {
        long x = (long) Math.sqrt(num);
        return x * x == num ? x : -1;
    }

}
