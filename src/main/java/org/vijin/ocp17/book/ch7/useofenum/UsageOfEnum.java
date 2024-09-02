package org.vijin.ocp17.book.ch7.useofenum;

public class UsageOfEnum {

  void switchEnum() {
    Season summer = Season.SUMMER;
    var message = switch (summer) {
      //does not compile - An enum switch case label must be the unqualified name of an enumeration constant
      //case Season.SPRING -> "not compile";
      case AUTUMN -> "get out";
      default -> "default";
    };

  }
}
