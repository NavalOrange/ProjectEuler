package ca.navalorange.questions1to50;

public class Q9 {
    public static void run() {
        int x = pythagoreanTriplet();
        System.out.println(x);
    }
    public static int pythagoreanTriplet() {
        for (int a = 1; a < 500; a++) {
            for (int b = 1; b < 500; b++) {
                for (int c = 1; c < 998; c++) {
                    if (a + b + c == 1000 && (a*a) + (b*b) == c*c) {
                        System.out.println("" + a + " " + b + " "+ c);
                        return a*b*c;
                    }
                }
            }
        }
        return 0;
    }
}

