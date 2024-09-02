package org.vijin.ocp17.book.ch2;

public class PrimitivePromoted {

  public static void main(String[] args) {
    //new PrimitivePromoted().multiPromotion();
    new PrimitivePromoted().shortPromotion();
  }

  void example() {
    float x = 5;
    //wrong does not compile:   incompatible types: possible lossy conversion from double to float
    //float x = 5.0;
    //right as I add the F
    float y = 5.0F;
  }

  void multiPromotion() {
    short w = 14;
    float x = 13;
    double y = 30;
    var z = w * x / y;

    Object obj = z;
    System.out.println(obj.getClass().getName()); //java.lang.Double
  }

  void shortPromotion() {
    short x = 5;
    short y = 6;
    var z = x + y;
    //z is an int
    System.out.println(z);
  }

  void floatAndDouble() {
    float f = 5.0F;
    double d = 5.0;
    //I can assign a float to a double
    double f2D = f;
    //I cannot assign a double to a float
    //float d2f = d;  //does not compile

    //but with explicit cast I can
    float d2fCast = (float) d;
  }

  void multiPromotion_steps() {
    short w = 14;
    float x = 13;
    var z = w * x;
    Object obj = z;
    System.out.println(obj.getClass().getName()); //java.lang.Float

    double y = 30;
    var last = z / y;

    obj = last;
    System.out.println(obj.getClass().getName()); //java.lang.Double
  }
}
