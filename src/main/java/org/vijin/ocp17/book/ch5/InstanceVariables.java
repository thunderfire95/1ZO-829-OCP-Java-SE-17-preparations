package org.vijin.ocp17.book.ch5;

public class InstanceVariables {

  final int y;
  public transient int z;
  protected volatile String name;
  private int x;


  public InstanceVariables(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
