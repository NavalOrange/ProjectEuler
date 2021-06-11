package ca.navalorange.questions1to50;

import java.math.BigInteger;

import static java.lang.Long.parseLong;

public class Q3 {
    public static void run() {
        Long val = 600851475143L;
        Long x = largestPrimeFactor(val);
        System.out.println(x);
    }
    public static long largestPrimeFactor(long num) {
        long currentFactor = 2;
        long val = num;
        while (currentFactor == 2) {
            if (num % currentFactor == 0) {
                val = val / currentFactor;
            } else {
                currentFactor = 3;
            }
        }
        while(currentFactor * currentFactor < val) {
            if (val % currentFactor == 0) {
                val = val / currentFactor;
            } else {
                currentFactor = currentFactor+2;
            }
        }
        return val;
    }

}