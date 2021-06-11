package ca.navalorange.questions1to50;

public class Q6 {
    public static void run() {
        int x = name();
        System.out.println(x);
    }
    public static int name() {
        int sum = 0;
        int prodSum = 0;
        for(int i = 1; i <=100; i++) {
            sum += i;
            prodSum += i*i;
        }
        int diff = prodSum - (sum*sum);
        return diff;
    }
}

