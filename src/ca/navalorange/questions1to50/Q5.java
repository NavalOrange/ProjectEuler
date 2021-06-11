package ca.navalorange.questions1to50;

public class Q5 {
    /**
     * Did a bit of digging, the math way to solve this problem is you prime factor all the numbers from 1-20, and multiply all the highest powers together.
     * 20 is 2^2 * 5
     * But 16 is 2^4, so we don't use anything from 20 or 12, or
     * Then you're left with (2^4)*(3^2)*5*7*11*13*17
     * wacky.
     */

    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     *
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void run() {
        int x = smallestMultiple();
        System.out.println(x);
    }
    //Upon a bit of thought,
    public static int smallestMultiple() {
        boolean isRight = true;
        for(int i = 20; i < 2000000000; i+=20) {
//            System.out.println(i);
            for(int j = 20; j > 2; j--) {
                if (i % j != 0) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                return i;
            }
            isRight = true;
        }
        return 0;
    }

}