package org.vijin.ocp17.various;

public class ReThrowException {

  public static void main(String[] args) {
    new ReThrowException().handleException();
  }

  void handleException() {
    try {
      throw new RuntimeException("error");

    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}
