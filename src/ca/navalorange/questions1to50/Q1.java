package ca.navalorange.questions1to50;

public class Q1 {
    public static void run() {
        int x = sumOfMultiplesOf3Or5();
        System.out.println(x);
    }
    public static int sumOfMultiplesOf3Or5() {
        int sum = 0;
        int max = 1000;
        int currValue = 3;
        while ( currValue < max ) {
            if (currValue % 3 == 0 || currValue % 5 == 0) {
//                System.out.println(currValue % 3);
                System.out.println(currValue);
                sum += currValue;
            }
            currValue++;
        }
        return sum;
    }
}
