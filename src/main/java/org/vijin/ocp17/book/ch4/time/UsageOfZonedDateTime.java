package org.vijin.ocp17.book.ch4.time;

import java.time.*;
import java.util.Set;

public class UsageOfZonedDateTime {

  public static void main(String[] args) {
    new UsageOfZonedDateTime().offset();
  }

  void zoneDateTime() {
    LocalDateTime now = LocalDateTime.now();
    ZoneId myZone = ZoneId.systemDefault();
    System.out.println("Output of systemDefault(): " + myZone);
    ZonedDateTime myZonedDateTime = ZonedDateTime.of(now, myZone);
    //2023-09-03T02:54:37.528950+02:00[Europe/Zurich]
    System.out.println(myZonedDateTime);

    //calculating time in bucharest now
    ZoneId zoneBucharest = ZoneId.of("Europe/Bucharest");
    ZonedDateTime zonedDateTimeInBucharest = ZonedDateTime.of(now, zoneBucharest);
    System.out.println(zonedDateTimeInBucharest);
    ZonedDateTime bucharestZonedDateTime = ZonedDateTime.now(zoneBucharest);

    //2023-09-03T03:57:27.798509+03:00[Europe/Bucharest]
    System.out.println(bucharestZonedDateTime);

  }

  void printZones() {
    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    System.out.println(String.format("found %d time zones", availableZoneIds.size()));
    availableZoneIds.forEach(System.out::println);
  }

  void createZonedDateTime() {
    ZoneId zoneZurich = ZoneId.of("Europe/Zurich");

    ZonedDateTime zdtExtended = ZonedDateTime.of(2023, 11, 10, 1, 20, 30, 100, zoneZurich);

    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    ZonedDateTime zdtLDLT = ZonedDateTime.of(localDate, localTime, zoneZurich);

    LocalDateTime localDateTime = LocalDateTime.now();
    ZonedDateTime zdtLDT = ZonedDateTime.of(localDateTime, zoneZurich);
    System.out.println(zdtLDT);  //2023-10-22T08:26:16.798939+02:00[Europe/Zurich]
  }

  void offset() {
    ZonedDateTime now = ZonedDateTime.now();
    ZoneOffset offset = now.getOffset();
    String id = offset.getId();
    System.out.println("id: %s".formatted(id)); //id: +01:00
    System.out.println(offset); //+01:00
  }

  void invalidZoneId() {
    //Exception in thread "main" java.time.zone.ZoneRulesException: Unknown time-zone ID: aa
    ZoneId.of("aa");
  }

}
