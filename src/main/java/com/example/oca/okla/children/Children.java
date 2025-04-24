package com.example.oca.okla.children;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

class CastleUnderSiegeException extends Exception {
}

class KnightAttackingException extends CastleUnderSiegeException {
}

abstract class Duck {
    protected int count;

    public abstract int getDuckies();
}

public class Children {
    private int age;

    public String getDuckies(String check) {
        try {
            System.out.println("vào try trước");
            System.out.println(check);
            return check;
        } finally {
            System.out.println("dbe");
        }
    }

    public static void main(String[] pondInfo) {
        LocalDate newYears = LocalDate.of(2017, 1, 1);
        Period period = Period.ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.print(format.format(newYears.minus(period)));

    }
}
