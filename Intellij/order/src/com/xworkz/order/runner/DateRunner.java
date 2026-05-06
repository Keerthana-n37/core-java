package com.xworkz.order.runner;

import java.time.LocalDate;

public class DateRunner {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate specificDate = LocalDate.of(2024, 5, 10);
        System.out.println("Specific Date: " + specificDate);

        LocalDate parsedDate = LocalDate.parse("2023-12-25");
        System.out.println("Parsed Date: " + parsedDate);

        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Month Value: " + today.getMonthValue());
        System.out.println("Day of Month: " + today.getDayOfMonth());
        System.out.println("Day of Year: " + today.getDayOfYear());
        System.out.println("Day of Week: " + today.getDayOfWeek());

        System.out.println("Plus Days: " + today.plusDays(10));
        System.out.println("Plus Months: " + today.plusMonths(2));
        System.out.println("Plus Years: " + today.plusYears(1));

        System.out.println("Minus Days: " + today.minusDays(5));
        System.out.println("Minus Months: " + today.minusMonths(1));
        System.out.println("Minus Years: " + today.minusYears(2));

        LocalDate anotherDate = LocalDate.of(2025, 1, 1);
        System.out.println("Is Before: " + today.isBefore(anotherDate));
        System.out.println("Is After: " + today.isAfter(anotherDate));
        System.out.println("Is Equal: " + today.isEqual(anotherDate));

        System.out.println("With Day Of Month: " + today.withDayOfMonth(1));
        System.out.println("With Month: " + today.withMonth(12));
        System.out.println("With Year: " + today.withYear(2030));

        System.out.println("Is Leap Year: " + today.isLeapYear());

        System.out.println("Length of Month: " + today.lengthOfMonth());
        System.out.println("Length of Year: " + today.lengthOfYear());

        System.out.println("Start of Year: " + today.withDayOfYear(1));
    }
}
