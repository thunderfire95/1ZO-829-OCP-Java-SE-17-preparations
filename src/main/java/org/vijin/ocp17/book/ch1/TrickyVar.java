package org.vijin.ocp17.book.ch1;

//var is not a reserved keyword
public class TrickyVar {

  public static void main(String[] args) {
    Var var = new Var();
    var.var();
  }


  void forVar() {
    for (var j = 0; j < 10; j++) {

    }
  }

  static class Var {

    // var is not a reserved word in Java
    public void var() {
      var var = "var";
    }

    public void Var() {
      Var var = new Var();
    }
  }

}


