package ca.navalorange.questions1to50;

import java.util.HashMap;

public class Q17 {
    public static void run() {
        initializeHashmap();
        int x = name();
//        calculateNum();
        System.out.println(x);
    }
    static HashMap<String, String> basicTable = new HashMap<>();
    static HashMap<String, String> prefixTable = new HashMap<>();
    public static void initializeHashmap() {
        basicTable.put("1", "one");
        basicTable.put("2", "two");
        basicTable.put("3", "three");
        basicTable.put("4", "four");
        basicTable.put("5", "five");
        basicTable.put("6", "six");
        basicTable.put("7", "seven");
        basicTable.put("8", "eight");
        basicTable.put("9", "nine");
        basicTable.put("10", "ten");
        basicTable.put("11", "eleven");
        basicTable.put("12", "twelve");
        basicTable.put("14", "fourteen"); // wow it took me too long to remember that four has 2 different prefixes for "teen" and "ty"

        prefixTable.put("2", "twen");
        prefixTable.put("3", "thir");
        prefixTable.put("4", "for");
        prefixTable.put("5", "fif");
        prefixTable.put("6", "six");
        prefixTable.put("7", "seven");
        prefixTable.put("8", "eigh");
        prefixTable.put("9", "nine");
    }
    public static int name() {
        int count = "onethousand".length();
        for (int num = 1; num <= 999; num++) {
            count = count + calculateNum(num);
        }
        return count;
    }
    public static int calculateNum(int num) {
        String numStr = ("" + num);
        int count = 0;
        if (numStr.length() == 3) {
            String val = basicTable.get(numStr.charAt(0) + "");
            count += val.length();
            System.out.print(val + "hundred");
            count += "hundred".length();
            num = num % 100;
            numStr = num + "";
            if (num != 0) {
                count += "and".length();
                System.out.print("and");
            }
        }
        if (basicTable.containsKey(numStr)) {
            String val = basicTable.get(numStr);
            count += val.length();
            System.out.print(val);
        } else {
            if (num == 0) {
                //doNothing
            } else if (numStr.charAt(0) == '1') {
                String val = prefixTable.get(numStr.charAt(1) + "");
                count += val.length();
                System.out.print(val+"teen");
                count += "teen".length();
            } else {
                String val = prefixTable.get(numStr.charAt(0) + "");
                count += val.length();
                System.out.print(val + "ty");
                count += "ty".length();
                num = num % 10;
                if (num > 0) {
                    numStr = num + "";
                    String lastNum = basicTable.get(numStr.charAt(0) + "");
                    count += lastNum.length();
                    System.out.print(lastNum);
                }
            }
        }
        System.out.println();
        return count;
    }
}

