package com.simple.example.project

/**
  * Created by bjacobs on 1/31/17.
  */
class CalculatorIT extends ScalaTestSupport{

  "add" should "return a valid number (not a real IT test)" in {

    val calculator = new Calculator

    val result = calculator.add(2,4)

    result should be(6)
  }

}
