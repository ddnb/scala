package com.lehungio

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers


/** @version 1.1.0 */
class ScalaChallengesUnitTest extends AnyFunSuite with Matchers {

  test("Ouput: Hello, World!") {
    ScalaChallenges.hello() should be ("Hello, World!")
  }
}
