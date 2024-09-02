package org.vijin.ocp17.book.ch4.array;

import java.util.Arrays;

public class UseOfArrays {

  public static void main(String[] args) {
    new UseOfArrays().compare();
  }

  void callProcess() {
    //not compile
    //process({0,1,2);
    process(new int[]{1, 2, 3});
  }

  void process(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }


  void mismatch() {
    String[] s1 = {"Camel", "Peacock", "Llama"};
    String[] s2 = {"Camel", "Llama", "Peacock"};
    String[] s3 = {"Camel", "Llama", "Peacock"};
    int position = Arrays.mismatch(s1, s2); //first element to differ is at position 1
    //1
    System.out.println(position);
    position = Arrays.mismatch(s2, s3); //they are identical then return -1
    //-1
    System.out.println(position);
  }

  void useEquals() {
    int[] array1 = {1, 3, 5};
    int[] array2 = {1, 3, 5};
    int[] array3 = {1, 5, 5};
    boolean equals = Arrays.equals(array1, array2);
    //true
    System.out.println(equals);
    equals = Arrays.equals(array1, array3);

    //false
    System.out.println(equals);

  }


  void compare() {
    int[] array1 = {1, 3, 5};
    int[] array2 = {1, 3, 5};
    int[] array3 = {1, 5, 5};
    int result = Arrays.compare(array1, array2);
    System.out.println(result);  //0
    //the first element which they differ is the 2nd position (3 vs 5)
    //In this case, we get a negative number because 3 is smaller than 5
    result = Arrays.compare(array1, array3);
    System.out.println(result);  //-1
  }

  void equalsOnArrays() {
    int[] a1 = {1, 2, 3};
    int[] a2 = {1, 2, 3};
    //false
    System.out.println(a1.equals(a2));
  }
}
