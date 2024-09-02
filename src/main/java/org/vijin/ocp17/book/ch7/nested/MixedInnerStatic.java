package org.vijin.ocp17.book.ch7.nested;

public class MixedInnerStatic {

  static void create() {
    //Mark is a static class no need to create an instance of MixedInnerStatic
    var mark = new Mark();
    //another way to create
    Mark mark2 = new Mark();
    //here I need an instance of MixedInnerStatic
    Cub c = new MixedInnerStatic().new Cub();
  }

  static class Mark {

  }

  class Cub {

  }


}
