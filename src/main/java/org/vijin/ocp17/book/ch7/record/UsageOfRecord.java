package org.vijin.ocp17.book.ch7.record;

public class UsageOfRecord {

  public static void main(String[] args) {
    Person person = new Person("Enrico", "Giurin");
    Person clone = new Person("Enrico", "Giurin");
    System.out.println(person);
    System.out.println(person.equals(clone));
  }
}

record Person(String firstName, String lastName) {

  static int cnt = 0;
  //Instance field is not allowed in record
  // final int x = 0;  //does not compile!

  static void printHello() {
    System.out.println("hello");
  }

  //the method can access directly to instance variables of the record
  void printCustomHello() {
    System.out.println("hello " + firstName + ", " + lastName);
  }

}
