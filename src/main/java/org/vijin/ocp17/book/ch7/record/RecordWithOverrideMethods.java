package org.vijin.ocp17.book.ch7.record;

public record RecordWithOverrideMethods(int first, int second) {


  public static int weight = 50;
  //I can define static fields
  private static int size = 10;

  public static void main(String[] args) {
    RecordWithOverrideMethods re = new RecordWithOverrideMethods(5, 7);
    //RecordWithOverrideMethods{first=1, second=1}
    System.out.println(re);
  }

  @Override
  public int first() {
    return first % 2;
  }

  public int second() {
    return second % 2;
  }

  @Override
  public String toString() {
    return "RecordWithOverrideMethods{" +
        "first=" + this.first() +
        ", second=" + this.second() +
        '}';
  }
}
