package com.example.oca.okla;

public class Employee {

    private static int price = 5;

     long compute() { return 10; }


    public static void main(String... arg) {
        String[] nycTourLoops = new String[]{"Downtown", "Uptown", "Brooklyn"};
        String[] times = new String[]{"Day", "Night"};
        for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++,
                j++) {
            System.out.print(nycTourLoops[i] + " " + times[j] + "-");
        }
    }
}
