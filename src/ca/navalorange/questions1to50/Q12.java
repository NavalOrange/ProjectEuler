package ca.navalorange.questions1to50;

import java.util.ArrayList;

public class Q12 {
    public static void run() {
        int x = highlyDivisibleTriangleNumber();
        System.out.println(x);
    }
    public static int highlyDivisibleTriangleNumber() {
        int currTriangleNum = 1;
        int currTriangleVal = 1;
        while(true) {
            currTriangleVal = (currTriangleNum*(currTriangleNum+1))/2;
            int numOfDivisors = countDivisors(currTriangleVal);
            if (numOfDivisors >= 500) {
                return currTriangleVal;
            }
            currTriangleNum++;
        }
    }
    public static int countDivisors(int num) {
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int count = -1;
        while (i*i <= num) {
            if (num % i == 0) {
                count += 2;
                list.add(i);
            }
            if (i*i == num) {
                count-=1;
            }
            i++;
        }
        System.out.println(list);
        return count;
    }
}

