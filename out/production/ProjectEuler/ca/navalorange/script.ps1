For ($i=7; $i -le 50; $i++) {
    Set-Content -Path "Q$i.java" -value "package ca.navalorange.questions1to50;

public class Q$i {
    public static void run() {
        int x = name();
        System.out.println(x);
    }
    public static int name() {
        return 0;
    }
}
"
}