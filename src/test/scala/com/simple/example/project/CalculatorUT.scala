package com.simple.example.project

/**
  * Created by bjacobs on 1/31/17.
  */
class CalculatorUT extends ScalaTestSupport{


  "add" should "return the correct result" in {
    val calculator = new Calculator

    val result = calculator.add(1,2)

    result should be(3)

  }

}
