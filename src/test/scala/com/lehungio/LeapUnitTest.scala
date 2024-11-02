package com.lehungio

import com.lehungio.classes.Leap
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/** @version 1.1.0 */
class LeapUnitTest extends AnyFunSuite with Matchers {

  // Create an instance
  val leap = new Leap()

  test("year not divisible by 4: common year") {
    leap.leapYear(2015) should be (false)
  }

  test("year divisible by 4, not divisible by 100: leap year") {
    // pending
    leap.leapYear(1996) should be (true)
  }

  test("year divisible by 100, not divisible by 400: common year") {
    // pending
    leap.leapYear(2100) should be (false)
  }

  test("year divisible by 400: leap year") {
    // pending
    leap.leapYear(2000) should be (true)
  }
}
