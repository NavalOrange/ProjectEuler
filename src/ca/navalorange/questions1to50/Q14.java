package ca.navalorange.questions1to50;

public class Q14 {
    public static void run() {
        int x = doCollatz(256);
        System.out.println(x);
    }
    public static int LongestCollatz() {
        int biggest = 0;
        for (int i = 999999; i > 13; i--) {
            int x = doCollatz(i);
            if (x > biggest) {
                biggest = x;
            }
        }
        return biggest;
    }
    static int doCollatz(int in) {
        long x = in;
        int count = 1;
        while (x != 1) {
            if (x % 2 == 0) {
                x = x/2;
            } else {
                x = (x*3)+1;
            }
            count++;
        }
        return count;
    }
}

