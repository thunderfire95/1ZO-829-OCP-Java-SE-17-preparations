package org.vijin.ocp17.book.ch5;

public class Boxing {

  public static void main(String[] args) {
    new Boxing().boxingArgument();
  }

  void boxing() {
    int age = 30;
    Integer wrapper = Integer.valueOf(age);
    int primitive = wrapper.intValue();
    //autoboxing
    wrapper = age;
    //unboxing
    primitive = wrapper;
  }

  void nullUnbox() {
    Integer wrapper = 30;
    wrapper = null;
    //Exception in thread "main" java.lang.NullPointerException:
    // Cannot invoke "java.lang.Integer.intValue()" because "wrapper" is null
    int primitive = wrapper;
  }

  void boxingArgument() {
    class NestedLocal {

      void print(Object obj) {
        if (obj instanceof Integer num) {
          System.out.println(num + 2);
        }
      }
    }//end of nested local
    NestedLocal nestedLocal = new NestedLocal();
    //here boxing is applied
    nestedLocal.print(5);
    nestedLocal.print(Integer.valueOf(5));
  }

}
