package com.xworkz.order.runner;

import java.time.LocalDateTime;

public class Date{

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now: " + now);

        LocalDateTime specificDateTime = LocalDateTime.of(2024, 5, 10, 14, 30, 45);
        System.out.println("Specific DateTime: " + specificDateTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2023-12-25T10:15:30");
        System.out.println("Parsed DateTime: " + parsedDateTime);

        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonth());
        System.out.println("Month Value: " + now.getMonthValue());
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
        System.out.println("Day of Year: " + now.getDayOfYear());
        System.out.println("Day of Week: " + now.getDayOfWeek());

        System.out.println("Plus Days: " + now.plusDays(10));
        System.out.println("Plus Months: " + now.plusMonths(2));
        System.out.println("Plus Years: " + now.plusYears(1));
        System.out.println("Plus Hours: " + now.plusHours(5));
        System.out.println("Plus Minutes: " + now.plusMinutes(30));

        System.out.println("Minus Days: " + now.minusDays(5));
        System.out.println("Minus Months: " + now.minusMonths(1));
        System.out.println("Minus Years: " + now.minusYears(2));
        System.out.println("Minus Hours: " + now.minusHours(3));

        LocalDateTime anotherDateTime = LocalDateTime.of(2025, 1, 1, 0, 0);

        System.out.println("Is Before: " + now.isBefore(anotherDateTime));
        System.out.println("Is After: " + now.isAfter(anotherDateTime));
        System.out.println("Is Equal: " + now.isEqual(anotherDateTime));

        System.out.println("With Day: " + now.withDayOfMonth(1));
        System.out.println("With Month: " + now.withMonth(12));
        System.out.println("With Year: " + now.withYear(2030));
        System.out.println("With Hour: " + now.withHour(10));
        System.out.println("With Minute: " + now.withMinute(0));

    }
}
