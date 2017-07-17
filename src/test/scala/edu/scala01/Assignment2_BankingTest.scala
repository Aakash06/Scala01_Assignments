package edu.scala01

import org.scalatest.FunSuite

class Assignment2_BankingTest extends FunSuite {

  test("testing credit method"){
    assert(Assignment2_Banking(1, "Aakash",0.0).credit(1000.0) == Assignment2_Banking(1,"Aakash",1000.0))
  }

  test("testing debit method"){
    assert(Assignment2_Banking(1, "Kapil" +
      "", 5000.0).debit(1000.0) == Assignment2_Banking(1,"Kapil",4000.0))
  }
}
