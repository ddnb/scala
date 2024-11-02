package com.lehungio

import com.lehungio.classes.TwoFer
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/** @version 1.1.0 */
class TwoFerUnitTest extends AnyFunSuite with Matchers {

  // Create an instance of HelloWorld to be used in the tests
  val twoFer = new TwoFer()

  test("no name given") {
    twoFer.twofer() should be ("One for you, one for me.")
  }

  test("a name given") {
    // pending
    twoFer.twofer("Alice") should be ("One for Alice, one for me.")
  }

  test("another name given") {
    // pending
    twoFer.twofer("Bob") should be ("One for Bob, one for me.")
  }
}
