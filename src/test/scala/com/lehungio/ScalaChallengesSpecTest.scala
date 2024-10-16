// package example

// class HelloSpec extends munit.FunSuite {
//   test("say hello") {
//     assertEquals(Hello.greeting, "hello")
//   }
// }

package com.lehungio

import org.scalatest.flatspec.AnyFlatSpec

class ScalaChallengesSpecTest extends AnyFlatSpec {

  "Greeting" should "return a greeting message with the given name" in {
    assert(ScalaChallenges.greeting("World") == "Hello, World!")
  }

}
