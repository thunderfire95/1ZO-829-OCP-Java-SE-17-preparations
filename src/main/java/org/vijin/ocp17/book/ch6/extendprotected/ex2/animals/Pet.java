package org.vijin.ocp17.book.ch6.extendprotected.ex2.animals;

public class Pet {

  public static void main(String[] args) {
    Pet pet = new Pet();
    //here I can access to the protected method ONLY because I am in the same package!
    //protected access on Pet
    pet.eat();
  }

  protected void eat() {
    System.out.println("Pet eating");
  }

}
