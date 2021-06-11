package ca.navalorange.questions1to50;

public class Q2 {
    public static void run() {
        int x = nufib(2, 3, 2);
        System.out.println(x);
    }
    public static int nufib(int runningSum, int currVal, int prev) {
        int newVal = currVal + prev;
        if (newVal > 4000000) {
            return runningSum;
        }
        if (newVal % 2 == 0) {
            runningSum += newVal;
        }
        System.out.println(newVal);
        return nufib(runningSum, newVal, currVal);
    }
}
