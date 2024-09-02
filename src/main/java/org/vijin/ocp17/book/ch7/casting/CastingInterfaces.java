package org.vijin.ocp17.book.ch7.casting;

interface Sport {

}

interface Lazy {

}

public class CastingInterfaces {

  public static void main(String[] args) {
    new CastingInterfaces()._instanceof();
  }

  void classCastException() {
    Enrico enrico = new Enrico();
    //explicit cast is allowed at compile time even if Sport and Lazy are unrelated
    //but it fails at runtime

    //Exception in thread "main" java.lang.ClassCastException: class org.vijin.ocp17.ch7.casting.Enrico cannot be cast to class org.vijin.ocp17.ch7.casting.Sport
    Sport enricoDoesSport = (Sport) enrico;
  }

  void _instanceof() {
    Enrico enrico = new Enrico();
    if (enrico instanceof Sport sport) {
      System.out.println("enrico does sport");
    }

  }


}

class Enrico implements Lazy {

}
