package org.vijin.ocp17.book.ch4.time;

import java.time.*;

public class DaylightSavingTime {

  public static void main(String[] args) {
    DaylightSavingTime instance = new DaylightSavingTime();
    instance.daylightSavingTimeMarch();
    System.out.println();

    instance.dayLightSavingTimeNovember();
    System.out.println();

    instance.changeTimeAroundDST();
    System.out.println();

    instance.dstNovember();
    System.out.println();

    instance.dstNovember2();

  }

  //time is changed from 2am to 3am
  void daylightSavingTimeMarch() {
    ZoneId usEastern = ZoneId.of("US/Eastern");
    System.out.println(usEastern);

    LocalDate dayLight = LocalDate.of(2022, Month.MARCH, 13);
    LocalTime timeDayLight = LocalTime.of(1, 30);
    ZonedDateTime zonedDateTime = ZonedDateTime.of(dayLight, timeDayLight, usEastern);
    System.out.println(zonedDateTime); //2022-03-13T01:30-05:00[US/Eastern]
    //now we increase time of one hour
    //at 2am the clock is changed one hour forward
    timeDayLight = timeDayLight.plusHours(1L);
    zonedDateTime = ZonedDateTime.of(dayLight, timeDayLight,
        usEastern); //2022-03-13T03:30-04:00[US/Eastern]
    //the GMT is changed
    System.out.println(zonedDateTime);
    System.out.println();
  }

  //time is changed from 2am to 1am
  void dayLightSavingTimeNovember() {
    var date = LocalDate.of(2023, Month.NOVEMBER, 5);
    var time = LocalTime.of(1, 30);
    var zone = ZoneId.of("US/Eastern");
    var zonedDateTime = ZonedDateTime.of(date, time, zone);
    System.out.println(zonedDateTime); //2023-11-05T01:30-04:00[US/Eastern]

    //we move the clock one hour forward
    zonedDateTime = zonedDateTime.plusHours(1);
    System.out.println(zonedDateTime); //2023-11-05T01:30-05:00[US/Eastern]
    //we move the clock one hour forward
    zonedDateTime = zonedDateTime.plusHours(1);
    System.out.println(zonedDateTime); // 2023-11-05T02:30-05:00[US/Eastern]
  }

  void changeTimeAroundDST() {
    var localDate = LocalDate.of(2022, 3, 13);
    var localTime = LocalTime.of(1, 0);
    var zone = ZoneId.of("America/New_York");
    var z = ZonedDateTime.of(localDate, localTime, zone);

    var offset = z.getOffset();
    System.out.println(offset);  //-05:00
    var duration = Duration.ofHours(3);
    var later = z.plus(duration);

    System.out.println(later.getHour() + " "
        + offset.equals(later.getOffset()));
    System.out.println(later.getOffset()); //-04:00
  }

  void dstNovember() {
    LocalDate localDate = LocalDate.of(2022, Month.NOVEMBER, 6);
    LocalTime time = LocalTime.of(1, 0);
    ZoneId zone = ZoneId.of("America/New_York");
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, time, zone);
    System.out.println(zonedDateTime); //2022-11-06T01:00-04:00[America/New_York]
    zonedDateTime = zonedDateTime.plusHours(1);
    //we repeat the hour but the offset is changed
    System.out.println(zonedDateTime); //2022-11-06T01:00-05:00[America/New_York]
  }

  void dstNovember2() {
    var localDate = LocalDate.of(2022, 3, 13);
    var localTime = LocalTime.of(2, 0);
    var zone = ZoneId.of("America/New_York");
    var z = ZonedDateTime.of(localDate, localTime, zone);
    // java adjusts the time to 3 a.m. automatically and changes the time zone.
    // It does not throw an exception
    System.out.println(z);  //2022-03-13T03:00-04:00[America/New_York]
  }


}
