package com.compute;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(" ---- BEGIN ---- ");


        final LocalDate manBirth = LocalDate.parse("1977-10-02");
        final LocalDate girlBirth = LocalDate.parse("1979-10-27");

        final LocalDate meet = LocalDate.parse("1996-06-21");


        Period manPeriod = Period.between(meet, manBirth);
        Period girlPeriod = Period.between(meet, girlBirth);

        System.out.println("manPeriod " + manPeriod);
        System.out.println("girlPeriod " + girlPeriod);

        System.out.println("man birthDay " + manBirth);
        System.out.println("meet " + meet);
        System.out.println("man half life " + manBirth.plus(manPeriod).plus(manPeriod));
        System.out.println("girl half life " + girlBirth.plus(girlPeriod).plus(girlPeriod));

        System.out.println(" ---- END ---- ");
    }
}
