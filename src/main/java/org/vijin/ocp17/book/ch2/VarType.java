package org.vijin.ocp17.book.ch2;

public class VarType {

  public static void main(String[] args) {
    new VarType().printVarType();
  }

  void printVarType() {
    var x = 5;
    Object obj = x;
    System.out.println(obj.getClass().getName());
    //will print java.lang.Integer
  }
}
