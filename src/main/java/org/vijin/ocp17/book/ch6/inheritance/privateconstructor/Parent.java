package org.vijin.ocp17.book.ch6.inheritance.privateconstructor;

public class Parent {

  //this constructor can be called only within the class itself
  private Parent() {
    System.out.println("Parent constructor");
  }

  //this can be called by classed within the same package
  Parent(String msg) {
    System.out.println("Parent constructor with message: %s".formatted(msg));
  }


}
