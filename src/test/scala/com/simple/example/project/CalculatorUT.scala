package com.simple.example.project

/**
  * Created by bjacobs on 1/31/17.
  */
class CalculatorUT extends ScalaTestSupport {


  "add" should "return the correct sum" in {

    val calculator = new Calculator

    val sum = calculator.add(1,2)

    sum should be(3)

  }

  "subtract" should "return the difference" in {

    val calculator = new Calculator

    val difference = calculator.subtract(3,2)

    difference should be(1)
  }

}
