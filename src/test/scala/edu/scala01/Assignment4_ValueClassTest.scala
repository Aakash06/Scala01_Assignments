package edu.scala01

import org.scalatest.FunSuite

class Assignment4_ValueClassTest extends FunSuite {

  test("testing display details method"){
    assert(new Assignment4_ValueClass().displayDetails(new FirstName("Aakash"),
      new LastName("Jain"), new Age(21)) == "Aakash Jain is of 21 years.")
  }

}
