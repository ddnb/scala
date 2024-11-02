package com.lehungio

import com.lehungio.classes.HelloWorld

object ScalaChallenges {
  def main(args: Array[String]): Unit = {
    // Creating an instance of HelloWorld will output the challenge name
    val helloWorld = new HelloWorld()
    println(helloWorld.hello())           // Output: "Hello, World!"
    println(helloWorld.greeting("Alice"))  // Output: "Hello, Alice!"
  }
}
