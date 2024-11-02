// package com.lehungio

// import org.scalatest.funsuite.AnyFunSuite
// import org.scalatest.matchers.should.Matchers


// /** @version 1.1.0 */
// class ScalaChallengesUnitTest extends AnyFunSuite with Matchers {

//   test("Ouput: Hello, World!") {
//     ScalaChallenges.hello() should be ("Hello, World!")
//   }
// }

package com.lehungio

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/** @version 1.1.0 */
class HelloWorldUnitTest extends AnyFunSuite with Matchers {

  // Create an instance of HelloWorld to be used in the tests
  val helloWorld = new HelloWorld()

  test("Output: Hello, World!") {
    helloWorld.hello() should be ("Hello, World!")
  }

  test("Output: Greeting message with name") {
    helloWorld.greeting("World") should be ("Hello, World!")
  }
}
