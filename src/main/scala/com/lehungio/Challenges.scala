package com.lehungio

import com.lehungio.classes.HelloWorld
import com.lehungio.objects.HammingDistance

object Challenges {
  def main(args: Array[String]): Unit = {
    // Challenge: Hello World
    // Creating an instance of HelloWorld will output the challenge name
    val helloWorld = new HelloWorld()
    println(helloWorld.hello())           // Output: "Hello, World!"
    println(helloWorld.greeting("Scala"))  // Output: "Hello, Alice!"

    // Challenge: Hamming Distance
    println(s"Check SCALA and ALACS: ${HammingDistance.calculate("SCALA", "ALACS")}") // Output: Some(4)
  }
}
