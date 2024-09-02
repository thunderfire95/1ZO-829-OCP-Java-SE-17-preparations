package org.vijin.ocp17.book.ch7.nested.inner;

public class Kitchen {

  public void bake() {
    Mixer.Spinner f = new Kitchen().new Mixer().new Spinner();
  }

  class Mixer {

    class Spinner {

    }
  }
}
