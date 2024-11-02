package com.lehungio

// Define the HelloWorld class inheriting from Challenges
class HelloWorld extends Challenges("HelloWorld") {
  def hello(): String = "Hello, World!"
  def greeting(name: String): String = s"Hello, $name!"
}
