package org.vijin.ocp17.book.ch1;

public class LocalVariable {

  //this compiles
  void local() {
    int x = 5;
    int y;
    if (x < 5) {
      y = 2;
    } else {
      y = 7;
    }
  }

  //this compiles
  void local_wrong() {
    int x = 5;
    int y;
    //does not compile: Variable 'y' might not have been initialized
    //int z=x+y;
  }

  void localNotUsed() {
    ////x is not initialized, but it's fine as long it's not used
    int x;
    int y = 6;
    System.out.println(y);
  }

  void localFinalVariables() {
    //both x & y are final
    final char x = 'a', y = 'b';
    //not allowed
    //y = 'z'
  }
}
