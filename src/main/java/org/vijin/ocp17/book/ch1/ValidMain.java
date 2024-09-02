package org.vijin.ocp17.book.ch1;

public class ValidMain {

  //this is still valid (with final)
  //both finals are optionals
  public static final void main(final String[] args) {
    System.out.println("main with final");

  }

  //this is the classic valid main
/*
    public static void main(String[] args) {
      System.out.println("main without final");
    }
*/


}
