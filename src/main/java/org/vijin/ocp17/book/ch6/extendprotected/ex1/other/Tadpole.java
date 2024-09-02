package org.vijin.ocp17.book.ch6.extendprotected.ex1.other;

import org.vijin.ocp17.book.ch6.extendprotected.ex1.animal.Frog;

public class Tadpole extends Frog {

  public static void main(String[] args) {
    Tadpole t = new Tadpole();
    t.eat();

    // Cannot be accessed from outside package
    //t.jump();
    Frog f = new Tadpole();
    //'eat()' has protected access in 'org.vijin.ocp17.ch6.extendprotected.animal.Frog'

    //here you are in the package other, and you are tyring to access to a method of Frog
    //(the type is Frog, not Tadpole) which is protected, then you cannot!
    //f.eat();

    // Cannot be accessed from outside package
    // f.jump();
  }

}
