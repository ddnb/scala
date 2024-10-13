// package example

// object Hello extends Greeting with App {
//   println(greeting)
// }

// trait Greeting {
//   lazy val greeting: String = "hello"
// }

package com.lehungio

object ScalaChallenges {
  def hello() = "Hello, World!"
  def greet(name: String): String = s"Hello, $name!"
}