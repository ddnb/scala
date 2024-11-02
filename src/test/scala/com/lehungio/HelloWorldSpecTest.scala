// package example

// class HelloSpec extends munit.FunSuite {
//   test("say hello") {
//     assertEquals(Hello.greeting, "hello")
//   }
// }

package com.lehungio

import org.scalatest.flatspec.AnyFlatSpec

class HelloWorldSpecTest extends AnyFlatSpec {

  // Create an instance of HelloWorld to be used in the tests
  val helloWorld = new HelloWorld()

  "HelloWorld" should "return 'Hello, World!' when hello is called" in {
    assert(helloWorld.hello() == "Hello, World!")
  }

  it should "return a greeting message with the given name" in {
    assert(helloWorld.greeting("World") == "Hello, World!")
  }
}
