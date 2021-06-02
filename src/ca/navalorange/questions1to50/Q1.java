package ca.navalorange.questions1to50;

public class Q1 {
    public static void run() {
        int x = sumOfMultiplesOf3Or5();
        System.out.println(x);
    }
    public static int sumOfMultiplesOf3Or5() {
        int sum = 0;
        int max = 1000;
        int currValue = 1;
        while ( currValue < max ) {
            if (currValue % 3 != 0 || currValue % 5 != 0) {
                sum += currValue;
            }
            currValue++;
        }
        return sum;
    }
}
