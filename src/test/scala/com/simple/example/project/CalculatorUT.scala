package com.simple.example.project

/**
  * Created by bjacobs on 1/31/17.
  */
class CalculatorUT extends ScalaTestSupport {

  val calculator = new Calculator

  "add" should "return the correct sum" in {

    val sum = calculator.add(1,2)

    sum should be(3)

  }

  "subtract" should "return the difference" in {

    val difference = calculator.subtract(3,2)

    difference should be(1)
  }

  "multiply" should "return the product" in {

    val product = calculator.multiply(3,2)

    product should be(6)

  }

}
