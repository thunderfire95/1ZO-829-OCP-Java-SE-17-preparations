package org.vijin.ocp17.book.ch4.time;

import org.vijin.ocp17.various.helper.Wiley;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class UsageOfPeriod {

  public static void main(String[] args) {
    new UsageOfPeriod().ofVsPlus();
  }

  void period() {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);     //2023-09-03T03:07:43.919980
    Period period = Period.ofDays(5).plusYears(1);
    System.out.println(period);  //P1Y5D
    LocalDateTime future = now.plus(period);
    System.out.println(future); //2024-09-08T03:07:43.919980
  }

  void periodDoesNotChain() {
    //Period does not chain. Only the last method is considered!
    Period period = Period.ofYears(1).ofMonths(2).ofDays(1);
    System.out.println(period);  //P1D
  }

  void addPeriodToLocalDate() {
    LocalDate today = LocalDate.now();
    System.out.println(today);  //2024-03-10
    //period of one year, one month, one day
    Period period = Period.of(1, 1, 1);
    LocalDate future = today.plus(period);
    System.out.println(future); //2025-04-11
  }
  void ofVsPlus() {
    //this is a static method
    Period oneDay = Period.ofDays(1);
    //this is an instance method, so this I can chain
    Period p2 = oneDay.plusDays(2);
    //example of chaining
    p2 = oneDay.plusYears(2).plusMonths(3).plusDays(5);
    System.out.println(p2);  //P2Y3M6D
  }

  void methodsOfPeriod() {
    Period period = Period.ofDays(4).plusMonths(2);
    int days = period.getDays();
    int months = period.getMonths();
    int years = period.getYears();
    System.out.println("days: " + days + " months: " + months + " years: " + years);
    //no methods such as getHours, getMinutes, getSeconds()

  }


  void performTask() {
    LocalDate start = LocalDate.now();
    Period period = Period.ofDays(1);
    LocalDate end = start.plus(1, ChronoUnit.WEEKS);
    performTask(start, end, period);

  }

  /**
   * You can create e Period with Period.of(x,y, z)
   */

  @Wiley
  void of() {
    Period birthday = Period.of(2023, Month.NOVEMBER.getValue(), 10);
    System.out.println(birthday);
  }

  private void performTask(LocalDate start, LocalDate end, Period period) {
    LocalDate up = start;
    while (up.isBefore(end)) {
      System.out.println("performing task");
      up = up.plus(period);
    }
    System.out.println("all taks completed");
  }

  void parsePeriod() {
    Period period = Period.parse("P2M3D");
    System.out.println(period);

    //Exception in thread "main" java.time.format.DateTimeParseException: Text cannot be parsed to a Period
    try {
      Period.parse("2M3D");
    } catch (DateTimeException e) {
      e.printStackTrace();
    }
  }


}
